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
 * @author mac
 */
public interface ApiService {

     /**
      * 获取视频类别
      *
      * @return 类别集合
      */
     JsonRootPojo<CategoriesResponse<Category>> getVideoCategory();

     /**
      * 获取收藏集
      *
      * @param page page
      * @param limit limit
      * @return result
      */
     JsonRootPojo<CollectionsResponse<Collection>> getCollections(int page, int limit);

     /**
      * 获取视频by limit
      *
      * @param page page
      * @param limit limit
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfLimit(int page, int limit);

     /**
      * 获取视频by desc
      *
      * @param page page
      * @param desc desc
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfDesc(int page, Parameter.DESC desc);

     /**
      * 获取视频by time
      *
      * @param page page
      * @param time time
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfTime(int page, Parameter.TIME time);

     /**
      * 获取视频by type
      *
      * @param page page
      * @param type limit
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfType(int page, Parameter.TYPE type);

     /**
      * 获取视频by chId
      *
      * @param page page
      * @param chId chId
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfChId(int page, Parameter.CHID chId);

     /**
      * 获取视频by vid
      *
      * @param vid vid
      * @return result
      */
     JsonRootPojo<VideoResponse<Video>> getVideoForVid(int vid);

     /**
      * 获取视频of search by limit
      *
      * @param query query
      * @param page page
      * @param limit limit
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByLimit(String query,int page,int limit);

     /**
      * 获取视频of search by desc
      *
      * @param query query
      * @param page page
      * @param desc desc
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByDesc(String query,int page,Parameter.DESC desc);

     /**
      * 获取视频of search by time
      *
      * @param query query
      * @param page page
      * @param time time
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByTime(String query,int page,Parameter.TIME time);

     /**
      * 获取视频of search by type
      *
      * @param query query
      * @param page page
      * @param type type
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByType(String query,int page,Parameter.TYPE type);

     /**
      * 获取视频of search by chId
      *
      * @param query query
      * @param page page
      * @param chId chId
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByChId(String query, int page, Parameter.CHID chId);

     /**
      * 获取视频of search JAVs By limit
      *
      * @param query query
      * @param page page
      * @param limit ；limit
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchAvByLimit(String query, int page, int limit);

     /**
      * 获取视频of search JAVs by desc
      *
      * @param query query
      * @param page page
      * @param desc desc
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchAvByDesc(String query, int page, Parameter.DESC desc);

     /**
      * 获取视频of search JAVs by time
      *
      * @param query query
      * @param page page
      * @param time time
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchAvByTime(String query, int page, Parameter.TIME time);

     /**
      * 获取视频of search  JAVs by type
      *
      * @param query query
      * @param page page
      * @param type type
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchAvByType(String query, int page, Parameter.TYPE type);

     /**
      * 获取视频of search JAVs by chId
      *
      * @param query query
      * @param page page
      * @param chId chId
      * @return result
      */
     JsonRootPojo<VideosResponse<Video>> getVideosOfSearchAvByChId(String query, int page, Parameter.CHID chId);

}

