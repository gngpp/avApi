package resp.collections;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 3:37 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class MovieResponse<T>{
    private boolean has_more;
    private Integer total_collections;
    private Integer current_offset;
    private Integer limit;
    private T collections;
}
