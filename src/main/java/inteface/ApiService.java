package inteface;

import inteface.parameter.Parameter;
import pojo.ApiResponse;
import pojo.av.VideoResponse;
import pojo.avtype.AVTypeResponse;
import pojo.collections.CollectionResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public interface ApiService {
     ApiResponse<AVTypeResponse> getVideoCategory();

     ApiResponse<CollectionResponse> getCollections(int page,int limit);

     ApiResponse<VideoResponse> getAllVideosOfLimit(int page, int limit);

     ApiResponse<VideoResponse> getAllVideosOfDesc(int page, Parameter.DESC desc);

     ApiResponse<VideoResponse> getAllVideosOfTime(int page, Parameter.TIME time);

     ApiResponse<VideoResponse> getAllVideosOfType(int page, Parameter.TYPE type);

     ApiResponse<VideoResponse> getAllVideosOfCHID(int page, Parameter.CHID chid);

}

