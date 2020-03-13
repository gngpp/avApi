import api.ApiServiceFactory;
import inteface.parameter.Parameter;
import pojo.videos.Video;
import pojo.categories.Category;
import pojo.collections.Collection;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 5:20 下午
 * amd
 */
public class Test {

    @org.junit.Test
    public void categoryTest(){
        List<Category> categories=ApiServiceFactory
                .getService()
                .getVideoCategory()
                .getResponse()
                .getCategories();
        categories.forEach(System.out::println);
    }

    @org.junit.Test
    public void CollectionTest(){
        List<Collection> collections=ApiServiceFactory
                .getService()
                .getCollections(2,19)
                .getResponse()
                .getCollections();
        collections.forEach(System.out::println);
    }
    @org.junit.Test
    public void videoOfDescTest(){
        List<Video> videoInfos0=ApiServiceFactory
                .getService()
                .getAllVideosOfDesc(2, Parameter.DESC.TOP_RATED)
                .getResponse()
                .getVideos();
        videoInfos0.forEach(System.out::println);


        List<Video> videoInfos1=ApiServiceFactory
                .getService()
                .getAllVideosOfDesc(2, Parameter.DESC.LAST_VIEWED)
                .getResponse()
                .getVideos();
        videoInfos1.forEach(System.out::println);


        List<Video> videoInfos2=ApiServiceFactory
                .getService()
                .getAllVideosOfDesc(2, Parameter.DESC.LATEST)
                .getResponse()
                .getVideos();
        videoInfos2.forEach(System.out::println);


        List<Video> videoInfos3=ApiServiceFactory
                .getService()
                .getAllVideosOfDesc(2, Parameter.DESC.LONGEST)
                .getResponse()
                .getVideos();
        videoInfos3.forEach(System.out::println);


        List<Video> videoInfos4=ApiServiceFactory
                .getService()
                .getAllVideosOfDesc(2, Parameter.DESC.MOST_VIEWED)
                .getResponse()
                .getVideos();
        videoInfos4.forEach(System.out::println);


        List<Video> videoInfos5=ApiServiceFactory
                .getService()
                .getAllVideosOfDesc(2, Parameter.DESC.MOST_FAVOURED)
                .getResponse()
                .getVideos();
        videoInfos5.forEach(System.out::println);


        Video videoInfo=ApiServiceFactory
                .getService()
                .getVideoForVID(2)
                .getResponse()
                .getVideo();
        System.out.println(videoInfo);
    }

    @org.junit.Test
    public void videoOfLimitTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getAllVideosOfLimit(3,30)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videoOfTimeTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getAllVideosOfTime(3, Parameter.TIME.DAY)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);

        List<Video> list2=ApiServiceFactory
                .getService()
                .getAllVideosOfTime(3, Parameter.TIME.WEEK)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);

        List<Video> list3=ApiServiceFactory
                .getService()
                .getAllVideosOfTime(3, Parameter.TIME.MONTH)
                .getResponse()
                .getVideos();
        list3.forEach(System.out::println);

        List<Video> list4=ApiServiceFactory
                .getService()
                .getAllVideosOfTime(3, Parameter.TIME.FOREVER)
                .getResponse()
                .getVideos();
        list4.forEach(System.out::println);
    }
    
    @org.junit.Test
    public void videoOfTypeTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getAllVideosOfType(2, Parameter.TYPE.PRIMARY)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);
        
        List<Video> list2=ApiServiceFactory
                .getService()
                .getAllVideosOfType(3, Parameter.TYPE.PUBLIC)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);
    }
    
    @org.junit.Test
    public void videoOfCHIDTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getAllVideosOfCHID(4, Parameter.CHID.ONE)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);
        
        List<Video> list2=ApiServiceFactory
                .getService()
                .getAllVideosOfCHID(5, Parameter.CHID.TWO)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);
        
        List<Video> list3=ApiServiceFactory
                .getService()
                .getAllVideosOfCHID(2, Parameter.CHID.THREE)
                .getResponse()
                .getVideos();
        list3.forEach(System.out::println);
    }

    @org.junit.Test
    public void videoForVID(){

        Video videoInfo=ApiServiceFactory
                .getService()
                .getVideoForVID(2)
                .getResponse()
                .getVideo();
        System.out.println(videoInfo);
    }
}
