package pojo.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 8:50 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class CategoryResponse {
    private List<Categories> categories;
}
