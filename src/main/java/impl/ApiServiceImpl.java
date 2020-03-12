package impl;

import inteface.ApiHttpInterface;
import inteface.ApiService;
import okhttp3.OkHttpClient;
import resp.avtype.ApiResponse;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

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
                .client(new OkHttpClient.Builder().
                        proxy(new Proxy(Proxy.Type.HTTP,new InetSocketAddress("localhost",1087)))
                        .connectTimeout(10, TimeUnit.SECONDS)
                        .build())
                .build();
        INTERFACE=retrofit.create(ApiHttpInterface.class);
    }


    public ApiResponse getVideoCategory() {
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
