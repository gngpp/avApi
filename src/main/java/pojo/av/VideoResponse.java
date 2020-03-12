package pojo.av;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/13 12:24 上午
 * amd
 */
@Data
@Accessors(chain = true)
public class VideoResponse {
    private String token;
    private Video video;
}
