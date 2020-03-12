package resp.av;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 4:01 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class AVVideoList<T>{
    private T av;
}
