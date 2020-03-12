package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:44 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class VideoResponse<T> {
    private T categories;
}
