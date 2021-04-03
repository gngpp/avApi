package inteface.impl;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import inteface.ApiHttpInterface;
import inteface.ApiService;
import inteface.parameter.Parameter;
import okhttp3.OkHttpClient;
import pojo.Result;
import pojo.videos.Video;
import pojo.videos.VideoResponse;
import pojo.videos.VideosResult;
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
 * @author mac
 */
public class ApiServiceImpl implements ApiService {

    private static final ApiHttpInterface INTERFACE;

    static {
        Retrofit retrofit= new Retrofit.Builder()
                .baseUrl("https://api.avgle.com/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                                                                                  .create()))
                .client(new OkHttpClient.Builder()
                        .proxy(new Proxy(Proxy.Type.HTTP,new InetSocketAddress("localhost",8889)))
                        .connectTimeout(1, TimeUnit.HOURS)
                        .build())
                .build();
        INTERFACE=retrofit.create(ApiHttpInterface.class);
    }

    @Override
    public Result<CategoriesResponse<Category>> getVideoCategory() {
        return executeCall(INTERFACE.getVideoCategory());
    }

    @Override
    public Result<CollectionsResponse<Collection>> getCollections(int page, int limit){
        return executeCall(INTERFACE.getCollections(page,limit));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfLimit(int page, int limit) {
        return executeCall(INTERFACE.getVideosOfLimit(page,limit));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfDesc(int page, Parameter.DESC desc) {
        return executeCall(INTERFACE.getVideosOfDesc(page,desc.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfTime(int page, Parameter.TIME time) {
        return executeCall(INTERFACE.getVideosOfTime(page,time.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfType(int page, Parameter.TYPE type) {
        return executeCall(INTERFACE.getVideosOfType(page,type.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfChId(int page, Parameter.CHID chId) {
        return executeCall(INTERFACE.getVideosOfChId(page, chId.value));
    }

    @Override
    public Result<VideoResponse<Video>> getVideoForVid(int vid) {
        return executeCall(INTERFACE.getVideoForVid(vid));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchByLimit(String query, int page, int limit) {
        return executeCall(INTERFACE.getVideosOfSearchByLimit(query, page, limit));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchByDesc(String query, int page, Parameter.DESC desc) {
        return executeCall(INTERFACE.getVideosOfSearchByDesc(query,page,desc.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchByTime(String query, int page, Parameter.TIME time) {
        return executeCall(INTERFACE.getVideosOfSearchByTime(query,page,time.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchByType(String query, int page, Parameter.TYPE type) {
        return executeCall(INTERFACE.getVideosOfSearchByType(query,page,type.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchByChId(String query, int page, Parameter.CHID chId) {
        return executeCall(INTERFACE.getVideosOfSearchByChId(query, page, chId.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchAvByLimit(String query, int page, int limit) {
        return executeCall(INTERFACE.getVideosOfSearchAvByLimit(query, page, limit));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchAvByDesc(String query, int page, Parameter.DESC desc) {
        return executeCall(INTERFACE.getVideosOfSearchAvByDesc(query, page, desc.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchAvByTime(String query, int page, Parameter.TIME time) {
        return executeCall(INTERFACE.getVideosOfSearchAvByTime(query, page, time.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchAvByType(String query, int page, Parameter.TYPE type) {
        return executeCall(INTERFACE.getVideosOfSearchAvByType(query, page, type.value));
    }

    @Override
    public Result<VideosResult<Video>> getVideosOfSearchAvByChId(String query, int page, Parameter.CHID chId) {
        return executeCall(INTERFACE.getVideosOfSearchAvByChId(query, page, chId.value));
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
