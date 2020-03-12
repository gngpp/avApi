package impl;

import inteface.ApiHttpInterface;
import inteface.ApiService;
import okhttp3.OkHttpClient;
import resp.avtype.VideoCategory;
import resp.avtype.VideoCategoryList;
import resp.avtype.VideoResponse;
import resp.avtype.VideoTypeInfo;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public class ApiServiceImpl implements ApiService {

    private static ApiHttpInterface INTERFACE;

    static {
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("https://api.avgle.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient()).build();
        INTERFACE=retrofit.create(ApiHttpInterface.class);
    }


    public VideoCategory<VideoResponse<VideoCategoryList<List<VideoTypeInfo>>>> getVideoCategory() {
        return executeCall(INTERFACE.getVideoCategory());
    }

//    public AllAV<AVResponse<AVVideoList<List<AVVideoInfo>>>> getAllAV() {
//        return executeCall(INTERFACE.getAllAV());
//    }

//    public MovieCollection<MovieResponse<MovieCollectionList<List<MovieCollectionInfo>>>> getMovieCollction() {
//        return null;
//    }


    <T> T executeCall(Call<T> call){
        try {
            return  call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
