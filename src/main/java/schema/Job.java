package schema;

import api.ApiServiceFactory;
import com.sun.xml.fastinfoset.algorithm.FloatEncodingAlgorithm;
import org.apache.ibatis.session.SqlSession;
import org.hibernate.Session;
import pojo.videos.Video;
import schema.entity.VideoInfo;
import schema.mapper.VideoInfoDao;

import java.sql.Date;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Create by Ant on 2020/3/14 2:01 下午
 * amd
 */
public class Job implements Runnable {

    private int pageNumber;
    private SqlSession sqlSession;
    private Set<Integer> completeCheck;

    public Job(int pageNumber, SqlSession sqlSession, Set<Integer> completeCheck) {
        this.pageNumber = pageNumber;
        this.sqlSession=sqlSession;
        this.completeCheck = completeCheck;
    }

    @Override
    public void run() {
        final VideoInfoDao mapper = sqlSession.getMapper(VideoInfoDao.class);
        if (completeCheck.contains(pageNumber)){
            return;
        }
        boolean flag=true;
        List<Video> list= Collections.emptyList();
        while (flag){
            try {
                list= ApiServiceFactory
                        .getService()
                        .getVideosOfLimit(pageNumber,50)
                        .getResponse()
                        .getVideos();
            }catch (Exception e){
                System.out.println(e.getMessage());
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                flag=true;
                continue;
            }
            flag=false;
        }

        try {
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
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sqlSession.commit(true);
        sqlSession.clearCache();
        sqlSession.close();
    }
}
