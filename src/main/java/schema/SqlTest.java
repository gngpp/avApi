package schema;

import api.ApiServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hibernate.SessionFactory;
import pojo.videos.Video;
import schema.entity.VideoInfo;
import schema.mapper.VideoInfoDao;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SqlTest {

    private static String resource="mybatis-config.xml";
    public static SqlSessionFactory getSqlSessionFactory(){
        try (InputStream inputStream= Resources.getResourceAsStream(resource)){
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        try {


                    insert();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert(){
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        final SqlSession sqlSession = sqlSessionFactory.openSession();
        final VideoInfoDao mapper = sqlSession.getMapper(VideoInfoDao.class);
        Executors.newFixedThreadPool(7)
                .submit(()->{
                    for (int i = 0; i < 2899; i++) {

                        List<Video> list = null;
                        try {
                            list = ApiServiceFactory
                                    .getService()
                                    .getVideosOfLimit(i, 50)
                                    .getResponse()
                                    .getVideos();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        if(!list.isEmpty()){
                            List<VideoInfo> list1=new ArrayList<>();
                            for (Video video : list) {
                                VideoInfo videoInfo = new VideoInfo();
                                videoInfo.setVid(video.getVid())
                                        .setUid(video.getUid())
                                        .setAddtime(new Date(video.getAddtime()))
                                        .setChannel(video.getChannel())
                                        .setDislikes(video.getDislikes())
                                        .setEmbeddedUrl(video.getEmbedded_url())
                                        .setDuration(video.getDuration())
                                        .setFramerate(video.getFramerate())
                                        .setKeyword(video.getKeyword())
                                        .setPreviewVideoUrl(video.getPreview_video_url())
                                        .setLikes(video.getLikes())
                                        .setViewnumber(video.getViewnumber())
                                        .setHd(video.isHd())
                                        .setPrivatee(video.isPrivatee())
                                        .setTitle(video.getTitle())
                                        .setPriviewUrl(video.getPreview_url())
                                        .setVideoUrl(video.getVideo_url());
                                list1.add(videoInfo);
                            }
                            mapper.batchInsert(list1);
                        }

                        sqlSession.commit(true);
                        sqlSession.clearCache();
                        System.out.println("页：" + i);

                    }
                });
    }

}
