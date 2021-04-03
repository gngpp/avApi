package schema;

import api.ApiServiceFactory;
import org.apache.ibatis.session.SqlSession;
import pojo.videos.Video;
import schema.dao.VideoInfoDao;
import schema.entity.VideoInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Create by Ant on 2020/3/14 2:01 下午
 * amd
 * @author mac
 */
public class Job implements Runnable {

    private final int pageNumber;
    private final SqlSession sqlSession;
    private final Set<Integer> completeCheck;

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
                list= ApiServiceFactory.getService()
                                       .getVideosOfLimit(pageNumber,250)
                                       .getResponse()
                                       .getVideos();
                // 资源爬取完毕退出
                if (list.isEmpty()) {
                    return;
                }
            }catch (Exception e){
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException ignored) {

                }
                flag=true;
                continue;
            }
            flag=false;
        }

        try {
            List<VideoInfo> list1=new ArrayList<>();
            for (Video video : list) {
                VideoInfo videoInfo = new VideoInfo();
                videoInfo.setVid(video.getVid())
                        .setUid(video.getUid())
                        .setAddtime(video.getAddtime())
                        .setChannel(video.getChannel())
                        .setDislikes(video.getDislikes())
                        .setEmbeddedUrl(video.getEmbeddedUrl())
                        .setDuration(video.getDuration())
                        .setFramerate(video.getFramerate())
                        .setKeyword(video.getKeyword())
                        .setPreviewVideoUrl(video.getPreviewVideoUrl())
                        .setLikes(video.getLikes())
                        .setViewnumber(video.getViewnumber())
                        .setHd(video.getHd())
                        .setPrivater(video.isPrivater())
                        .setTitle(video.getTitle())
                        .setPreviewUrl(video.getPreviewUrl())
                        .setVideoUrl(video.getVideoUrl())
                        .setPrivater(video.isPrivater());
                list1.add(videoInfo);
            }
            mapper.batchInsert(list1);
            sqlSession.commit(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        completeCheck.add(pageNumber);
        sqlSession.close();
    }
}
