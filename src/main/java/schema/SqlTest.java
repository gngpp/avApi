package schema;

import api.ApiServiceFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojo.videos.Video;
import java.sql.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SqlTest {
    private static SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();


    public static void main(String[] args) {
        insert();
    }

    public static void insert(){
       final ExecutorService executorService= Executors.newFixedThreadPool(5);
        executorService.submit(()->{
            try(Session session=sessionFactory.openSession()){

                /**
                 * page count
                 */
                for (int i = 0; i <1000 ; i++) {

                    List<Video> list= ApiServiceFactory
                            .getService()
                            .getVideosOfLimit(i,50)
                            .getResponse()
                            .getVideos();

                    try{
                        session.beginTransaction();
                        for (Video video : list) {

                            VideoInfo videoInfo=new VideoInfo();
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
                                    .setPrivatee((byte)1)
                                    .setHd((byte)1)
                                    .setTitle(video.getTitle())
                                    .setPriviewUrl(video.getPreview_url())
                                    .setVideoUrl(video.getVideo_url());
                            System.out.println(video);
                            session.save(videoInfo);

                        }
                        session.getTransaction().commit();

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("页数："+i);
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
