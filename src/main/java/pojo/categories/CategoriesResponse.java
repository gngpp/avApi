package pojo.categories;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 8:50 下午
 * amd
 * @author mac
 */
@Data
@Accessors(chain = true)
public class CategoriesResponse<T>{
    private List<T> categories;
}
