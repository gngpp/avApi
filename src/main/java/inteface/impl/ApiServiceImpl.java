package inteface.impl;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
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
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                                                                                  .create()))
                .client(new OkHttpClient.Builder().
                        proxy(new Proxy(Proxy.Type.HTTP,new InetSocketAddress("localhost",1087)))
                        .connectTimeout(1, TimeUnit.HOURS)
                        .build())
                .build();
        INTERFACE=retrofit.create(ApiHttpInterface.class);
    }

    @Override
    public JsonRootPojo<CategoriesResponse<Category>> getVideoCategory() {
        return executeCall(INTERFACE.getVideoCategory());
    }

    @Override
    public JsonRootPojo<CollectionsResponse<Collection>> getCollections(int page, int limit){
        return executeCall(INTERFACE.getCollections(page,limit));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfLimit(int page, int limit) {
        return executeCall(INTERFACE.getVideosOfLimit(page,limit));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfDesc(int page, Parameter.DESC desc) {
        return executeCall(INTERFACE.getVideosOfDesc(page,desc.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfTime(int page, Parameter.TIME time) {
        return executeCall(INTERFACE.getVideosOfTime(page,time.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfType(int page, Parameter.TYPE type) {
        return executeCall(INTERFACE.getVideosOfType(page,type.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfCHID(int page, Parameter.CHID chid) {
        return executeCall(INTERFACE.getVideosOfCHID(page,chid.value));
    }

    @Override
    public JsonRootPojo<VideoResponse<Video>> getVideoForVID(int vid) {
        return executeCall(INTERFACE.getVideoForVID(vid));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByLimit(String query, int page, int limit) {
        return executeCall(INTERFACE.getVideosOfSearchBylimit(query,page,limit));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByDesc(String query, int page, Parameter.DESC desc) {
        return executeCall(INTERFACE.getVideosOfSearchByDesc(query,page,desc.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByTime(String query, int page, Parameter.TIME time) {
        return executeCall(INTERFACE.getVideosOfSearchByTime(query,page,time.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByType(String query, int page, Parameter.TYPE type) {
        return executeCall(INTERFACE.getVideosOfSearchByType(query,page,type.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchByCHID(String query, int page, Parameter.CHID chid) {
        return executeCall(INTERFACE.getVideosOfSearchByCHID(query,page, chid.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchJAVsByLimit(String query, int page, int limit) {
        return executeCall(INTERFACE.getVideosOfSearchJAVsByLimit(query,page,limit));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchJAVsByDesc(String query, int page, Parameter.DESC desc) {
        return executeCall(INTERFACE.getVideosOfSearchJAVsByDesc(query,page,desc.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchJAVsByTime(String query, int page, Parameter.TIME time) {
        return executeCall(INTERFACE.getVideosOfSearchJAVsByTime(query,page,time.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchJAVsByType(String query, int page, Parameter.TYPE type) {
        return executeCall(INTERFACE.getVideosOfSearchJAVsByType(query,page,type.value));
    }

    @Override
    public JsonRootPojo<VideosResponse<Video>> getVideosOfSearchJAVsByCHID(String query, int page, Parameter.CHID chid) {
        return executeCall(INTERFACE.getVideosOfSearchJAVsByCHID(query,page,chid.value));
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
