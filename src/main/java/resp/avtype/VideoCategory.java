package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:20 下午
 * amd
 */
@Data
public class VideoCategory <T>{
    private boolean success;
    private T response;
}
