package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:26 下午
 * amd
 */
@Data
public class VideoTypeInfo {
    private Integer CHID;
    private String  name;
    private String slug;
    private Integer total_videos;
    private String category_url;
    private String cover_url;
}
