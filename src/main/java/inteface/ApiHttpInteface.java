package inteface;

import jdk.nashorn.internal.runtime.logging.Logger;
import resp.av.AllAV;
import resp.avtype.VideoCategory;
import resp.collections.MovieCollection;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Create by Ant on 2020/3/12 4:20 下午
 * amd
 */
public interface ApiHttpInteface {
    @GET("/v1/categories")
    Call<VideoCategory> getVideoCategory();

    @GET("/v1/collections")
    Call<MovieCollection> getMovieCallection();

    @GET("/v1/collections/")
    Call<AllAV> getAllAV();

}
