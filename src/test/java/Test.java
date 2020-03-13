import api.ApiServiceFactory;
import inteface.parameter.Parameter;
import pojo.av.Video;
import pojo.avtype.Category;
import pojo.collection.Collection;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 5:20 下午
 * amd
 */
public class Test {
    public static void main(String[] args) {
        List<Category> categories=ApiServiceFactory.getService().getVideoCategory().getResponse().getCategories();
        categories.forEach(System.out::println);

        List<Collection> collections=ApiServiceFactory.getService().getCollections(2,19).getResponse().getCollections();
        collections.forEach(System.out::println);

        List<Video> videoInfos0=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.TOP_RATED).getResponse().getVideos();
        videoInfos0.forEach(System.out::println);

        List<Video> videoInfos1=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.LAST_VIEWED).getResponse().getVideos();
        videoInfos1.forEach(System.out::println);

        List<Video> videoInfos2=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.LATEST).getResponse().getVideos();
        videoInfos2.forEach(System.out::println);

        List<Video> videoInfos3=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.LONGEST).getResponse().getVideos();
        videoInfos3.forEach(System.out::println);

        List<Video> videoInfos4=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.MOST_VIEWED).getResponse().getVideos();
        videoInfos4.forEach(System.out::println);

        List<Video> videoInfos5=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.MOST_FAVOURED).getResponse().getVideos();
        videoInfos5.forEach(System.out::println);

        Video videoInfo=ApiServiceFactory.getService().getVideoForVID(2).getResponse().getVideo();
        System.out.println(videoInfo);






    }
}
