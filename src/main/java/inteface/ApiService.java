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

/**
 * Create by Ant on 2020/3/12 4:36 下午
 * amd
 */
public interface ApiService {
    VideoCategory<VideoResponse<VideoCategoryList<VideoTypeInfo>>> getVideoCategory();
    AllAV<AVResponse<AVVideoList<AVVideoInfo>>> getAllAV();
    MovieCollection<MovieResponse<MovieCollectionList<MovieCollectionInfo>>> getMovieCollction();
}

