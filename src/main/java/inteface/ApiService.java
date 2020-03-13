package inteface;

import inteface.parameter.Parameter;
import jdk.nashorn.internal.scripts.JS;
import pojo.JsonRootPojo;
import pojo.videos.Video;
import pojo.videos.VideoResponse;
import pojo.videos.VideosResponse;
import pojo.categories.Category;
import pojo.categories.CategoriesResponse;
import pojo.collections.CollectionsResponse;
import pojo.collections.Collection;

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public interface ApiService {
     JsonRootPojo<CategoriesResponse<Category>> getVideoCategory();

     JsonRootPojo<CollectionsResponse<Collection>> getCollections(int page, int limit);

     JsonRootPojo<VideosResponse<Video>> getVideosOfLimit(int page, int limit);

     JsonRootPojo<VideosResponse<Video>> getVideosOfDesc(int page, Parameter.DESC desc);

     JsonRootPojo<VideosResponse<Video>> getVideosOfTime(int page, Parameter.TIME time);

     JsonRootPojo<VideosResponse<Video>> getVideosOfType(int page, Parameter.TYPE type);

     JsonRootPojo<VideosResponse<Video>> getVideosOfCHID(int page, int chid);

     JsonRootPojo<VideoResponse<Video>>  getVideoForVID(int vid);

     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByLimit(String query,int page,int limit);

     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByDesc(String query,int page,Parameter.DESC desc);

     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByTime(String query,int page,Parameter.TIME time);

     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByType(String query,int page,Parameter.TYPE type);

     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByCHID(String query,int page,int chid);





}

