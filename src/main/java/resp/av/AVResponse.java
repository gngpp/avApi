package resp.av;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:58 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class AVResponse<T> {
    private String has_name;
    private Integer current_offset;
    private Integer total_videos;
    private  Integer limit;
    private T videos;
}
