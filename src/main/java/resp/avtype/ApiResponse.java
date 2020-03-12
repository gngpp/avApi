package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 8:51 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class ApiResponse {

    private boolean success;
    private Response response;

}