package pojo.videos;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 3:58 下午
 * amd
 * @author mac
 */
@Data
@Accessors(chain = true)
public class VideosResult<T> {
    private String hasName;
    private Integer currentOffset;
    private Integer totalVideos;
    private Integer limit;
    private List<T> videos;
}

