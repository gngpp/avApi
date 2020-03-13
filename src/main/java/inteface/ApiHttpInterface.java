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
 */
public interface ApiHttpInterface {
    @GET("/v1/categories")
    Call<JsonRootPojo<CategoriesResponse<Category>>> getVideoCategory();

    @GET("/v1/collections/{page}")
    Call<JsonRootPojo<CollectionsResponse<Collection>>> getCollections(@Path("page") int page,
                                                                       @Query("limit")int limit);


    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfLimit(@Path("page")int page,
                                                               @Query("limit")int limit);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfDesc(@Path("page")int page,
                                                              @Query("o")String desc);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfTime(@Path("page")int page,
                                                              @Query("t")String time);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfType(@Path("page")int page,
                                                              @Query("type")String type);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfCHID(@Path("page") int page,
                                                              @Query("c")int chid);
    @GET("/v1/video/{vid}")
    Call<JsonRootPojo<VideoResponse<Video>>> getVideoForVID(@Path("vid")int vid);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchBylimit(@Path("query")String query,
                                                                       @Path("page")int page,
                                                                       @Query("limit")int limit);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByDesc(@Path("query")String query,
                                                                     @Path("page")int page,
                                                                     @Query("o")String desc);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByType(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("type")String type);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByTime(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("t")String time);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchByCHID(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("c")int chid);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchJAVsBylimit(@Path("query")String query,
                                                                       @Path("page")int page,
                                                                       @Query("limit")int limit);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchJAVsByDesc(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("o")String desc);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchJAVsByType(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("type")String type);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchJAVsByTime(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("t")String time);

    @GET("/v1/search/{query}/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getVideosOfSearchJAVsByCHID(@Path("query")String query,
                                                                      @Path("page")int page,
                                                                      @Query("c")int chid);
}
