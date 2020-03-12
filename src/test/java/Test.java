import api.ApiServiceFactory;
import pojo.av.Video;

/**
 * Create by Ant on 2020/3/12 5:20 下午
 * amd
 */
public class Test {
    public static void main(String[] args) {
//        List<Categories> categories=ApiServiceFactory.getService().getVideoCategory().getResponse().getCategories();
//        for (Categories categories1:categories){
//            System.out.println(categories1);
//        }
//
//        List<Collections> collections=ApiServiceFactory.getService().getCollections(2,19).getResponse().getCollections();
//        for (Collections collection:collections){
//            System.out.println(collection);
//        }


       // List<Video> videoInfos=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.TOP_RATED).getResponse().getVideos();
        Video videoInfos=ApiServiceFactory.getService().getVideoForVID(2).getResponse().getVideo();
        System.out.println(videoInfos);


    }
}
