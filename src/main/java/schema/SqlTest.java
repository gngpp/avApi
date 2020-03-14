package schema;

import api.ApiServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.videos.Video;
import schema.entity.VideoInfo;
import schema.mapper.VideoInfoDao;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

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
        final ExecutorService executorService = Executors.newFixedThreadPool(7);

        for (int i = 0; i < 2899; i++) {
            int finalI = i;
            AtomicBoolean flag= new AtomicBoolean(true);
            executorService.submit(()->{
                    List<Video> list = ApiServiceFactory
                            .getService()
                            .getVideosOfLimit(finalI, 50)
                            .getResponse()
                            .getVideos();

                    if(!list.isEmpty()){
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
                            mapper.insertOne(videoInfo);
                            sqlSession.commit(true);
                        }

                    }else {
                        flag.set(false);
                    }
                });
            if (!flag.get()){
                continue;
            }else {
                System.out.println("页：" + finalI);
            }


        }
    }

}
