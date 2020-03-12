package inteface;

import inteface.parameter.Parameter;
import pojo.ApiResponse;
import pojo.av.VideoResponse;
import pojo.av.VideosResponse;
import pojo.avtype.CategoryResponse;
import pojo.collections.CollectionResponse;

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public interface ApiService {
     ApiResponse<CategoryResponse> getVideoCategory();

     ApiResponse<CollectionResponse> getCollections(int page,int limit);

     ApiResponse<VideosResponse> getAllVideosOfLimit(int page, int limit);

     ApiResponse<VideosResponse> getAllVideosOfDesc(int page, Parameter.DESC desc);

     ApiResponse<VideosResponse> getAllVideosOfTime(int page, Parameter.TIME time);

     ApiResponse<VideosResponse> getAllVideosOfType(int page, Parameter.TYPE type);

     ApiResponse<VideosResponse> getAllVideosOfCHID(int page, Parameter.CHID chid);

     ApiResponse<VideoResponse> getVideoForVID(int vid);


}

