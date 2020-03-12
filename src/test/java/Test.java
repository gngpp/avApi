import api.ApiServiceFactory;
import inteface.parameter.Parameter;
import pojo.av.VideoInfo;
import pojo.av.VideoResponse;
import pojo.avtype.Categories;
import pojo.collections.Collections;

import java.io.IOException;
import java.util.List;

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

        List<VideoInfo> videoInfos=ApiServiceFactory.getService().getAllVideosOfDesc(2, Parameter.DESC.LONGEST).getResponse().getVideos();
        for (VideoInfo videoInfo:videoInfos){
            System.out.println(videoInfo);
        }


    }
}
