package impl;

import inteface.ApiHttpInterface;
import inteface.ApiService;
import inteface.parameter.Parameter;
import okhttp3.OkHttpClient;
import pojo.JsonRootPojo;
import pojo.av.Video;
import pojo.av.VideoResponse;
import pojo.av.VideosResponse;
import pojo.avtype.Categories;
import pojo.avtype.CategoryResponse;
import pojo.collection.CollectionResponse;
import pojo.collection.Collections;
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


    public JsonRootPojo<CategoryResponse<Categories>> getVideoCategory() {
        return executeCall(INTERFACE.getVideoCategory());
    }


    public JsonRootPojo<CollectionResponse<Collections>> getCollections(int page, int limit){
        return executeCall(INTERFACE.getCollections(page,limit));
    }

    public JsonRootPojo<VideosResponse<Video>> getAllVideosOfLimit(int page, int limit) {
        return executeCall(INTERFACE.getAllVideosOfLimit(page,limit));
    }

    public JsonRootPojo<VideosResponse<Video>> getAllVideosOfDesc(int page, Parameter.DESC desc) {

        switch(desc) {
            case LATEST:
                return executeCall(INTERFACE.getAllVideosOfDesc(page, "mr"));

            case LONGEST:
                return executeCall(INTERFACE.getAllVideosOfDesc(page, "lg"));
            case TOP_RATED:
                return executeCall(INTERFACE.getAllVideosOfDesc(page, "tr"));

            case LAST_VIEWED:
                return executeCall(INTERFACE.getAllVideosOfDesc(page, "bw"));

            case MOST_VIEWED:
                return executeCall(INTERFACE.getAllVideosOfDesc(page, "mv"));

            case MOST_FAVOURED:
                return executeCall(INTERFACE.getAllVideosOfDesc(page, "tf"));

        }
        return null;

    }

    public JsonRootPojo<VideosResponse<Video>> getAllVideosOfTime(int page, Parameter.TIME time) {
        switch (time){
            case DAY:
                return executeCall(INTERFACE.getAllVideosOfTime(page,"t"));

            case WEEK:
                return executeCall(INTERFACE.getAllVideosOfTime(page,"w"));

            case MONTH:
                return executeCall(INTERFACE.getAllVideosOfTime(page,"m"));

            case FOREVER:
                return executeCall(INTERFACE.getAllVideosOfTime(page,"a"));
        }
        return null;
    }

    public JsonRootPojo<VideosResponse<Video>> getAllVideosOfType(int page, Parameter.TYPE type) {
        switch(type){
            case PUBLIC:
                return executeCall(INTERFACE.getAllVideosOfType(page,"public"));

            case PRIMARY:
                return executeCall(INTERFACE.getAllVideosOfType(page,"private"));
        }
        return null;
    }

    public JsonRootPojo<VideosResponse<Video>> getAllVideosOfCHID(int page, Parameter.CHID chid) {
        switch (chid){
            case ONE:
                return executeCall(INTERFACE.getAllVideosOfCHID(page,"1"));

            case TWO:
                return executeCall(INTERFACE.getAllVideosOfCHID(page,"2"));

            case THREE:
                return executeCall(INTERFACE.getAllVideosOfCHID(page,"3"));
        }
        return null;
    }

    public JsonRootPojo<VideoResponse<Video>> getVideoForVID(int vid) {
        return executeCall(INTERFACE.getVideoForVID(vid));
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
