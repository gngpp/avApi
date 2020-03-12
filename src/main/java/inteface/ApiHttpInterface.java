package inteface;

import jdk.nashorn.internal.runtime.logging.Logger;
import resp.av.AVResponse;
import resp.av.AVVideoInfo;
import resp.av.AVVideoList;
import resp.av.AllAV;
import resp.avtype.VideoCategory;
import resp.avtype.VideoCategoryList;
import resp.avtype.VideoResponse;
import resp.avtype.VideoTypeInfo;
import resp.collections.MovieCollection;
import resp.collections.MovieCollectionInfo;
import resp.collections.MovieCollectionList;
import resp.collections.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 4:20 下午
 * amd
 */
public interface ApiHttpInterface {
    @GET("/v1/categories")
    Call<VideoCategory<VideoResponse<VideoCategoryList<List<VideoTypeInfo>>>>> getVideoCategory();

//    @GET("/v1/collections")
//    Call<MovieCollection<MovieResponse<MovieCollectionList<List<MovieCollectionInfo>>>>> getMovieCallection();
//
//    @GET("/v1/collections")
//    Call<AllAV<AVResponse<AVVideoList<List<AVVideoInfo>>>>> getAllAV();

}