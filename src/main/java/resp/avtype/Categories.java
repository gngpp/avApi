package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 3:24 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class Categories<T> {
    private List<T> infos;
}
