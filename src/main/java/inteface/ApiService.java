package inteface;

import resp.av.AVResponse;
import resp.av.AVVideoInfo;
import resp.av.AVVideoList;
import resp.av.AllAV;
import resp.avtype.VideoCategory;
import resp.avtype.VideoCategoryList;
import resp.avtype.VideoResponse;
import resp.avtype.VideoTypeInfo;
import resp.collections.MovieCollection;
import resp.collections.MovieCollectionList;
import resp.collections.MovieCollectionInfo;
import resp.collections.MovieResponse;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public interface ApiService {
    VideoCategory<VideoResponse<VideoCategoryList<List<VideoTypeInfo>>>> getVideoCategory();
//    AllAV<AVResponse<AVVideoList<List<AVVideoInfo>>>> getAllAV();
//    MovieCollection<MovieResponse<MovieCollectionList<List<MovieCollectionInfo>>>> getMovieCollction();
}

