package impl;

import inteface.ApiHttpInterface;
import inteface.ApiService;
import inteface.parameter.Parameter;
import okhttp3.OkHttpClient;
import pojo.JsonRootPojo;
import pojo.videos.Video;
import pojo.videos.VideoResponse;
import pojo.videos.VideosResponse;
import pojo.categories.Category;
import pojo.categories.CategoriesResponse;
import pojo.collections.CollectionsResponse;
import pojo.collections.Collection;
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


    public JsonRootPojo<CategoriesResponse<Category>> getVideoCategory() {
        return executeCall(INTERFACE.getVideoCategory());
    }


    public JsonRootPojo<CollectionsResponse<Collection>> getCollections(int page, int limit){
        return executeCall(INTERFACE.getCollections(page,limit));
    }

    public JsonRootPojo<VideosResponse<Video>> getVideosOfLimit(int page, int limit) {
        return executeCall(INTERFACE.getVideosOfLimit(page,limit));
    }

    public JsonRootPojo<VideosResponse<Video>> getVideosOfDesc(int page, Parameter.DESC desc) {

        switch(desc) {
            case LATEST:
                return executeCall(INTERFACE.getVideosOfDesc(page, "mr"));

            case LONGEST:
                return executeCall(INTERFACE.getVideosOfDesc(page, "lg"));
            case TOP_RATED:
                return executeCall(INTERFACE.getVideosOfDesc(page, "tr"));

            case LAST_VIEWED:
                return executeCall(INTERFACE.getVideosOfDesc(page, "bw"));

            case MOST_VIEWED:
                return executeCall(INTERFACE.getVideosOfDesc(page, "mv"));

            case MOST_FAVOURED:
                return executeCall(INTERFACE.getVideosOfDesc(page, "tf"));

        }
        return null;

    }

    public JsonRootPojo<VideosResponse<Video>> getVideosOfTime(int page, Parameter.TIME time) {
        switch (time){
            case DAY:
                return executeCall(INTERFACE.getVideosOfTime(page,"t"));

            case WEEK:
                return executeCall(INTERFACE.getVideosOfTime(page,"w"));

            case MONTH:
                return executeCall(INTERFACE.getVideosOfTime(page,"m"));

            case FOREVER:
                return executeCall(INTERFACE.getVideosOfTime(page,"a"));
        }
        return null;
    }

    public JsonRootPojo<VideosResponse<Video>> getVideosOfType(int page, Parameter.TYPE type) {
        switch(type){
            case PUBLIC:
                return executeCall(INTERFACE.getVideosOfType(page,"public"));

            case PRIMARY:
                return executeCall(INTERFACE.getVideosOfType(page,"private"));
        }
        return null;
    }

    public JsonRootPojo<VideosResponse<Video>> getVideosOfCHID(int page, Parameter.CHID chid) {
        switch (chid){
            case ONE:
                return executeCall(INTERFACE.getVideosOfCHID(page,"1"));

            case TWO:
                return executeCall(INTERFACE.getVideosOfCHID(page,"2"));

            case THREE:
                return executeCall(INTERFACE.getVideosOfCHID(page,"3"));
        }
        return null;
    }

    public JsonRootPojo<VideoResponse<Video>> getVideoForVID(int vid) {
        return executeCall(INTERFACE.getVideoForVID(vid));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByLimit(String query, int page, int limit) {
        return executeCall(INTERFACE.get)
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByDesc(String query, int page, Parameter.DESC desc) {
        return null;
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByTime(String query, int page, Parameter.TIME time) {
        return null;
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByType(String query, int page, Parameter.TYPE type) {
        return null;
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByCHID(String query, int page, Parameter.CHID chid) {
        return null;
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
