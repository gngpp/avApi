package inteface;

import inteface.parameter.Parameter;
import pojo.JsonRootPojo;
import pojo.videos.Video;
import pojo.videos.VideoResponse;
import pojo.videos.VideosResponse;
import pojo.categories.Category;
import pojo.categories.CategoriesResponse;
import pojo.collections.CollectionsResponse;
import pojo.collections.Collection;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Create by Ant on 2020/3/12 4:20 下午
 * amd
 * @author mac
 */
public interface ApiHttpInterface {

    /**
     * 获取视频类别
     *
     * @return 类别集合
     */
    @GET("/v1/categories")
    Call<JsonRootPojo<CategoriesResponse<Category>>> getVideoCategory();

    /**
     * 获取收藏集
     *
     * @param page page
     * @param limit limit
     * @return result
     */
    @GET("/v1/collections/{page}")
    Call<JsonRootPojo<CollectionsResponse<Collection>>> getCollections(@Path("page") int page,
                                                                       @Query("limit")int limit);

    /**
     * 获取视频by limit
     *
     * @param page page
     * @param limit limit
     * @return result
     */
    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfLimit(@Path("page")int page,
                                                               @Query("limit")int limit);

    /**
     * 获取视频by desc
     *
     * @param page page
     * @param desc desc
     * @return result
     */
    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfDesc(@Path("page")int page,
                                                              @Query("o")String desc);

    /**
     * 获取视频by time
     *
     * @param page page
     * @param time time
     * @return result
     */
    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfTime(@Path("page")int page,
                                                              @Query("t")String time);

    /**
     * 获取视频by type
     *
     * @param page page
     * @param type limit
     * @return result
     */
    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfType(@Path("page")int page,
                                                              @Query("type")String type);

    /**
     * 获取视频by chId
     *
     * @param page page
     * @param chId chId
     * @return result
     */
    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfChId(@Path("page") int page,
                                                              @Query("c")int chId);

    /**
     * 获取视频by vid
     *
     * @param vid vid
     * @return result
     */
    @GET("/v1/video/{vid}")
    Call<JsonRootPojo<VideoResponse<Video>>> getVideoForVid(@Path("vid")int vid);

    /**
     * 获取视频of search by limit
     *
     * @param query query
     * @param page page
     * @param limit limit
     * @return result
     */
    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByLimit(@Path("query")String query,
                                                                       @Path("page")int page,
                                                                       @Query("limit")int limit);

    /**
     * 获取视频of search by desc
     *
     * @param query query
     * @param page page
     * @param desc desc
     * @return result
     */
    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByDesc(@Path("query")String query,
                                                                     @Path("page")int page,
                                                                     @Query("o")String desc);
    /**
     * 获取视频of search by type
     *
     * @param query query
     * @param page page
     * @param type type
     * @return result
     */
    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByType(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("type")String type);
    /**
     * 获取视频of search by type
     *
     * @param query query
     * @param page page
     * @param time time
     * @return result
     */
    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByTime(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("t")String time);
    /**
     * 获取视频of search by chId
     *
     * @param query query
     * @param page page
     * @param chId chId
     * @return result
     */
    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByChId(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("c")int chId);
    /**
     * 获取视频of search JAVs By limit
     *
     * @param query query
     * @param page page
     * @param limit ；limit
     * @return result
     */
    @GET("/v1/jav/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchAvByLimit(@Path("query")String query,
                                                                         @Path("page")int page,
                                                                         @Query("limit")int limit);
    /**
     * 获取视频of search JAVs by desc
     *
     * @param query query
     * @param page page
     * @param desc desc
     * @return result
     *
     */
    @GET("/v1/jav/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchAvByDesc(@Path("query")String query,
                                                                        @Path("page")int page,
                                                                        @Query("o")String desc);
    /**
     * 获取视频of search JAVs by time
     *
     * @param query query
     * @param page page
     * @param type type
     * @return result
     */
    @GET("/v1/jav/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchAvByType(@Path("query")String query,
                                                                        @Path("page")int page,
                                                                        @Query("type")String type);
    /**
     * 获取视频of search  JAVs by type
     *
     * @param query query
     * @param page page
     * @param time time
     * @return result
     */
    @GET("/v1/jav/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchAvByTime(@Path("query")String query,
                                                                        @Path("page")int page,
                                                                        @Query("t")String time);
    /**
     * 获取视频of search JAVs by chId
     *
     * @param query query
     * @param page page
     * @param chId chId
     * @return result
     */
    @GET("/v1/jav/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchAvByChId(@Path("query")String query,
                                                                        @Path("page")int page,
                                                                        @Query("c")int chId);
}
