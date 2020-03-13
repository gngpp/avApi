package inteface;

import inteface.parameter.Parameter;
import pojo.JsonRootPojo;
import pojo.av.Video;
import pojo.av.VideoResponse;
import pojo.av.VideosResponse;
import pojo.avtype.Category;
import pojo.avtype.CategoriesResponse;
import pojo.collection.CollectionsResponse;
import pojo.collection.Collection;

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public interface ApiService {
     JsonRootPojo<CategoriesResponse<Category>> getVideoCategory();

     JsonRootPojo<CollectionsResponse<Collection>> getCollections(int page, int limit);

     JsonRootPojo<VideosResponse<Video>> getAllVideosOfLimit(int page, int limit);

     JsonRootPojo<VideosResponse<Video>> getAllVideosOfDesc(int page, Parameter.DESC desc);

     JsonRootPojo<VideosResponse<Video>> getAllVideosOfTime(int page, Parameter.TIME time);

     JsonRootPojo<VideosResponse<Video>> getAllVideosOfType(int page, Parameter.TYPE type);

     JsonRootPojo<VideosResponse<Video>> getAllVideosOfCHID(int page, Parameter.CHID chid);

     JsonRootPojo<VideoResponse<Video>> getVideoForVID(int vid);


}

