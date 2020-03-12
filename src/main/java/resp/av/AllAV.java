package resp.av;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:57 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class AllAV <T> {
    private boolean success;
    private T response;
}
