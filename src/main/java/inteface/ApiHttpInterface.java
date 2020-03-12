package inteface;

import resp.avtype.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Create by Ant on 2020/3/12 4:20 下午
 * amd
 */
public interface ApiHttpInterface {
    @GET("/v1/categories")
    Call<ApiResponse> getVideoCategory();

//    @GET("/v1/collections")
//    Call<MovieCollection<MovieResponse<MovieCollectionList<List<MovieCollectionInfo>>>>> getMovieCallection();
//
//    @GET("/v1/collections")
//    Call<AllAV<AVResponse<AVVideoList<List<AVVideoInfo>>>>> getAllAV();

}
