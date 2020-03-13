package pojo.collection;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 3:50 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class CollectionsResponse<T> {
    private boolean has_more;
    private Integer total_collections;
    private Integer current_offset;
    private Integer limit;
    private List<T> collections;
}
