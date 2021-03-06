package pojo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 9:23 下午
 * amd
 * @author mac
 */
@Data
@Accessors(chain = true)
public class Result<T>{
    private boolean success;
    private T response;
}
