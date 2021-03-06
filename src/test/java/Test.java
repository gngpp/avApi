import api.ApiServiceFactory;
import inteface.parameter.Parameter;
import pojo.videos.Video;
import pojo.categories.Category;
import pojo.collections.Collection;

import java.io.*;
import java.util.*;

/**
 * Create by Ant on 2020/3/12 5:20 下午
 * amd
 */
public class Test {

    @org.junit.Test
    public void categoryTest() throws IOException {
//        List<Category> categories=ApiServiceFactory
//                .getService()
//                .getVideoCategory()
//                .getResponse()
//                .getCategories();
//        categories.forEach(System.out::println);
        final Object object = new Object();

        Thread t1 = new Thread() {

            public void run()             {

                synchronized (object) {

                    System.out.println("T1 start!");

                    try {

                        object.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                    System.out.println("T1 end!");

                }

            }

        };

        Thread t2 = new Thread() {

            public void run()             {

                synchronized (object) {

                    System.out.println("T2 start!");

                    object.notify();

                    System.out.println("T2 end!");

                }

            }

        };

        Thread t3 = new Thread() {

            public void run()          {

                synchronized (object) {

                    System.out.println("T3 start!");

                    object.notify();

                    System.out.println("T3 end!");

                }

            }

        };

        Thread t4 = new Thread() {

            public void run()             {

                synchronized (object) {

                    System.out.println("T4 start!");

                    try {

                        object.wait();

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                    System.out.println("T4 end!");

                }

            }

        };

        t1.start();

        t2.start();

        t3.start();

        t4.start();
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
                .getVideoForVid(2)
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
                .getVideosOfChId(4, Parameter.CHID.D3)
                .getResponse()
                .getVideos();
        list1.forEach(System.out::println);

        List<Video> list2=ApiServiceFactory
                .getService()
                .getVideosOfChId(5, Parameter.CHID.ANAL)
                .getResponse()
                .getVideos();
        list2.forEach(System.out::println);

        List<Video> list3=ApiServiceFactory
                .getService()
                .getVideosOfChId(2, Parameter.CHID.ASIAN)
                .getResponse()
                .getVideos();
        list3.forEach(System.out::println);
    }

    @org.junit.Test
    public void videoForVID(){

        Video videoInfo=ApiServiceFactory
                .getService()
                .getVideoForVid(2)
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
                .getVideosOfSearchByChId("少女", 1, Parameter.CHID.ASIAN)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByLimitTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchAvByLimit("少女", 0, 2)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByDescTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchAvByDesc("少女", 0, Parameter.DESC.LATEST)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByTimeTest(){
        List<Video> list=ApiServiceFactory
                .getService()
                .getVideosOfSearchAvByTime("熟女", 0, Parameter.TIME.WEEK)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByTypeTest(){
        List<Video> list = ApiServiceFactory
                .getService()
                .getVideosOfSearchAvByType("日本", 1, Parameter.TYPE.PUBLIC)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    @org.junit.Test
    public void videosOfSearchJAVsByCHIDTest(){
        List<Video> list = ApiServiceFactory
                .getService()
                .getVideosOfSearchAvByChId("中国", 0, Parameter.CHID.AV_ACTRESS)
                .getResponse()
                .getVideos();
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println(new Date(1565701207));
    }
}
