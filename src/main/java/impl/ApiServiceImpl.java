package impl;

import inteface.ApiHttpInterface;
import inteface.ApiService;
import inteface.parameter.Parameter;
import okhttp3.OkHttpClient;
import pojo.ApiResponse;
import pojo.av.VideoResponse;
import pojo.avtype.AVTypeResponse;
import pojo.collections.CollectionResponse;
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
    private static ApiResponse<VideoResponse> responseApiResponse=null;
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


    public ApiResponse<AVTypeResponse> getVideoCategory() {
        return executeCall(INTERFACE.getVideoCategory());
    }


    public ApiResponse<CollectionResponse> getCollections(int page,int limit){
        return executeCall(INTERFACE.getCollections(page,limit));
    }

    public ApiResponse<VideoResponse> getAllVideosOfLimit(int page, int limit) {
        return executeCall(INTERFACE.getAllVideosOfLimit(page,limit));
    }

    public ApiResponse<VideoResponse> getAllVideosOfDesc(int page, Parameter.DESC desc) {

        switch(desc){
            case LATEST:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfDesc(page,"mr"));
                break;

            case LONGEST:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfDesc(page,"lg"));
                break;
            case TOP_RATED:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfDesc(page,"tr"));
                break;
            case LAST_VIEWED:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfDesc(page,"bw"));
                break;
            case MOST_VIEWED:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfDesc(page,"mv"));
                break;
            case MOST_FAVOURED:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfDesc(page,"tf"));
                break;
            default:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfDesc(page,"mr"));
        }
        return responseApiResponse;
    }

    public ApiResponse<VideoResponse> getAllVideosOfTime(int page, Parameter.TIME time) {
        switch (time){
            case DAY:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfTime(page,"t"));
                break;
            case WEEK:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfTime(page,"w"));
                break;
            case MONTH:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfTime(page,"m"));
                break;
            case FOREVER:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfTime(page,"a"));
                break;
            default:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfTime(page,"a"));
        }
        return responseApiResponse;
    }

    public ApiResponse<VideoResponse> getAllVideosOfType(int page, Parameter.TYPE type) {
        switch(type){
            case PUBLIC:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfType(page,"public"));
                break;
            case PRIMARY:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfType(page,"private"));
                break;
        }
        return responseApiResponse;
    }

    public ApiResponse<VideoResponse> getAllVideosOfCHID(int page, Parameter.CHID chid) {
        switch (chid){
            case ONE:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfCHID(page,"1"));
                break;
            case TWO:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfCHID(page,"2"));
                break;
            case THREE:
                responseApiResponse=executeCall(INTERFACE.getAllVideosOfCHID(page,"3"));
                break;
        }
        return responseApiResponse;
    }


    <T> T executeCall(Call<T> call){
        try {
            return  call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
