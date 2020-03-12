package impl;

import inteface.ApiHttpInteface;
import inteface.ApiService;
import okhttp3.OkHttpClient;
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
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public class ApiServiceImpl implements ApiService {

    private static  ApiHttpInteface INTEFACE;

    static{
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://api.avgle.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient()).build();
        INTEFACE=retrofit.create(ApiHttpInteface.class);
    }

    public VideoCategory<VideoResponse<VideoCategoryList<VideoTypeInfo>>> getVideoCategory() {
        return executeCall(INTEFACE.getVideoCategory());
    }

    public AllAV<AVResponse<AVVideoList<AVVideoInfo>>> getAllAV() {
        return executeCall(INTEFACE.getAllAV());
    }

    public MovieCollection<MovieResponse<MovieCollectionList<MovieCollectionInfo>>> getMovieCollction() {
        return executeCall(INTEFACE.getMovieCallection());
    }
    private <T> T executeCall(Call<T> call){
        try{
            return  call.execute().body();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
