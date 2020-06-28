package pojo.collections;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 3:50 下午
 * amd
 * @author mac
 */
@Data
@Accessors(chain = true)
public class CollectionsResponse<T> {
    private boolean hasMore;
    private Integer totalCollections;
    private Integer currentOffset;
    private Integer limit;
    private List<T> collections;
}
