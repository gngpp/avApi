package resp.collections;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 3:50 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class Collections<T> {
    private List<T> infos;
}
