package resp.collections;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:34 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class MovieInfo {
    private Integer id;
    private String title;
    private String keyword;
    private String cover_url;
    private String total_count;
    private String colletion_usr;
}
