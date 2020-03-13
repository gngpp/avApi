package pojo.videos;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/13 12:24 上午
 * amd
 */
@Data
@Accessors(chain = true)
public class VideoResponse <T>{
    private String token;
    private T video;
}
