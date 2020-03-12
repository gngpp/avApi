package inteface;

import inteface.parameter.Parameter;
import pojo.ApiResponse;
import pojo.av.VideoResponse;
import pojo.avtype.AVTypeResponse;
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
    Call<ApiResponse<AVTypeResponse>> getVideoCategory();

    @GET("/v1/collections/{page}")
    Call<ApiResponse<CollectionResponse>> getCollections(@Path("page") int page,
                                                         @Query("limit")int limit);


    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideoResponse>> getAllVideosOfLimit(@Path("page")int page,
                                                  @Query("limit")int limit);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideoResponse>> getAllVideosOfDesc(@Path("page")int page,
                                                  @Query("o")String param);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideoResponse>> getAllVideosOfTime(@Path("page")int page,
                                                  @Query("t")String param);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideoResponse>> getAllVideosOfType(@Path("page")int page,
                                                  @Query("type")String param);

    @GET("/v1/videos/{page}")
    Call<ApiResponse<VideoResponse>> getAllVideosOfCHID(@Path("page")int page,
                                                  @Query("c")String param);


}
