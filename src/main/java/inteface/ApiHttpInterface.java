package inteface;

import pojo.JsonRootPojo;
import pojo.av.Video;
import pojo.av.VideoResponse;
import pojo.av.VideosResponse;
import pojo.avtype.Category;
import pojo.avtype.CategoriesResponse;
import pojo.collection.CollectionsResponse;
import pojo.collection.Collection;
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
    Call<JsonRootPojo<VideosResponse<Video>>> getAllVideosOfLimit(@Path("page")int page,
                                                                  @Query("limit")int limit);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getAllVideosOfDesc(@Path("page")int page,
                                                          @Query("o")String param);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getAllVideosOfTime(@Path("page")int page,
                                                          @Query("t")String param);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getAllVideosOfType(@Path("page")int page,
                                                          @Query("type")String param);

    @GET("/v1/videos/{page}")
    Call<JsonRootPojo<VideosResponse<Video>>> getAllVideosOfCHID(@Path("page") int page,
                                                          @Query("c")String param);
    @GET("/v1/video/{vid}")
    Call<JsonRootPojo<VideoResponse<Video>>> getVideoForVID(@Path("vid")int vid);


}
