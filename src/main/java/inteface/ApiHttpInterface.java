package inteface;

import pojo.ApiResponse;
import pojo.av.VideoResponse;
import pojo.av.VideosResponse;
import pojo.avtype.CategoryResponse;
import pojo.collections.CollectionResponse;
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
    Call<ApiResponse<CategoryResponse>> getVideoCategory();

    @GET("/v1/collections/{page}")
    Call<ApiResponse<CollectionResponse>> getCollections(@Path("page") int page,
                                                         @Query("limit")int limit);


    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideosResponse>> getAllVideosOfLimit(@Path("page")int page,
                                                          @Query("limit")int limit);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideosResponse>> getAllVideosOfDesc(@Path("page")int page,
                                                         @Query("o")String param);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideosResponse>> getAllVideosOfTime(@Path("page")int page,
                                                         @Query("t")String param);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideosResponse>> getAllVideosOfType(@Path("page")int page,
                                                         @Query("type")String param);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideosResponse>> getAllVideosOfCHID(@Path("page") int page,
                                                         @Query("c")String param);
    @GET("/v1/video/{vid}")
    Call<ApiResponse<VideoResponse>> getVideoForVID(@Path("vid")int vid);


}
