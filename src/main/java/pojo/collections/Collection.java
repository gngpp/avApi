package pojo.collections;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:34 下午
 * amd
 * @author mac
 */
@Data
@Accessors(chain = true)
public class Collection {
    private Integer id;
    private String title;
    private String keyword;
    private String coverUrl;
    private String totalCount;
    private String colletion_usr;
}
