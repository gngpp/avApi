import api.ApiServiceFactory;
import ch.qos.logback.core.net.SyslogOutputStream;
import inteface.parameter.Parameter;
import pojo.videos.Video;
import pojo.categories.Category;
import pojo.collections.Collection;

import java.util.Date;
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
                .getVideosOfDesc(2, Parameter.DESC.TOP_RATED)
                .getResponse()
                .getVideos();
        videoInfos0.forEach(System.out::println);


        List<Video> videoInfos1=ApiServiceFactory
                .getService()
                .getVideosOfDesc(2, Parameter.DESC.LAST_VIEWED)
                .getResponse()
                .getVideos();
        videoInfos1.forEach(System.out::println);


        List<Video> videoInfos2=ApiServiceFactory
                .getService()
                .getVideosOfDesc(2, Parameter.DESC.LATEST)
                .getResponse()
                .getVideos();
        videoInfos2.forEach(System.out::println);


        List<Video> videoInfos3=ApiServiceFactory
                .getService()
                .getVideosOfDesc(2, Parameter.DESC.LONGEST)
                .getResponse()
                .getVideos();
        videoInfos3.forEach(System.out::println);


        List<Video> videoInfos4=ApiServiceFactory
                .getService()
                .getVideosOfDesc(2, Parameter.DESC.MOST_VIEWED)
                .getResponse()
                .getVideos();
        videoInfos4.forEach(System.out::println);


        List<Video> videoInfos5=ApiServiceFactory
                .getService()
                .getVideosOfDesc(2, Parameter.DESC.MOST_FAVOURED)
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
                .getVideosOfLimit(0,50)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videoOfTimeTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getVideosOfTime(3, Parameter.TIME.DAY)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);

        List<Video> list2=ApiServiceFactory
                .getService()
                .getVideosOfTime(3, Parameter.TIME.WEEK)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);

        List<Video> list3=ApiServiceFactory
                .getService()
                .getVideosOfTime(3, Parameter.TIME.MONTH)
                .getResponse()
                .getVideos();
        list3.forEach(System.out::println);

        List<Video> list4=ApiServiceFactory
                .getService()
                .getVideosOfTime(3, Parameter.TIME.FOREVER)
                .getResponse()
                .getVideos();
        list4.forEach(System.out::println);
    }
    
    @org.junit.Test
    public void videoOfTypeTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getVideosOfType(2, Parameter.TYPE.PRIMARY)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);
        
        List<Video> list2=ApiServiceFactory
                .getService()
                .getVideosOfType(3, Parameter.TYPE.PUBLIC)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);
    }
    
    @org.junit.Test
    public void videoOfCHIDTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getVideosOfCHID(4, Parameter.CHID.D3)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);
        
        List<Video> list2=ApiServiceFactory
                .getService()
                .getVideosOfCHID(5, Parameter.CHID.ANAL)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);
        
        List<Video> list3=ApiServiceFactory
                .getService()
                .getVideosOfCHID(2, Parameter.CHID.ASIAN)
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

    @org.junit.Test
    public void videosOfSearchByLimitTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchByLimit("人妻",1,2)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void vidoesOfSearchByDescTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getVideosOfSearchByDesc("人妻",40,Parameter.DESC.LATEST)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);

        List<Video> list2=ApiServiceFactory
                .getService()
                .getVideosOfSearchByDesc("人妻",20,Parameter.DESC.MOST_FAVOURED)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);

        List<Video> list3=ApiServiceFactory
                .getService()
                .getVideosOfSearchByDesc("人妻",10,Parameter.DESC.LAST_VIEWED)
                .getResponse()
                .getVideos();
        list3.forEach(System.out::println);

        List<Video> list4=ApiServiceFactory
                .getService()
                .getVideosOfSearchByDesc("人妻",1,Parameter.DESC.MOST_VIEWED)
                .getResponse()
                .getVideos();
        list4.forEach(System.out::println);

        List<Video> list5=ApiServiceFactory
                .getService()
                .getVideosOfSearchByDesc("人妻",30,Parameter.DESC.LONGEST)
                .getResponse()
                .getVideos();
        list5.forEach(System.out::println);

        List<Video> list6=ApiServiceFactory
                .getService()
                .getVideosOfSearchByDesc("人妻",20,Parameter.DESC.TOP_RATED)
                .getResponse()
                .getVideos();
        list6.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchByTimeTest(){
        List<Video> list1=ApiServiceFactory
                .getService()
                .getVideosOfSearchByTime("人妻",10, Parameter.TIME.FOREVER)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchByTypeTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchByType("人妻",0, Parameter.TYPE.PUBLIC)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);

    }

    @org.junit.Test
    public void videosOfSearchByCHID(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchByCHID("少女",1, Parameter.CHID.ASIAN)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByLimitTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchJAVsByLimit("少女",0,2)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByDescTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchJAVsByDesc("少女",0, Parameter.DESC.LATEST)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByTimeTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchJAVsByTime("熟女",0, Parameter.TIME.WEEK)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByTypeTest(){
        List<Video> list = ApiServiceFactory
                .getService()
                .getVideosOfSearchJAVsByType("日本",1, Parameter.TYPE.PUBLIC)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByCHIDTest(){
        List<Video> list = ApiServiceFactory
                .getService()
                .getVideosOfSearchJAVsByCHID("中国",0, Parameter.CHID.AV_ACTRESS)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println(new Date(1565701207));
    }
}
