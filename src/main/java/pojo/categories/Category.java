package pojo.categories;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Copyright 2020 benson.com
 * @author mac
 */
@Data
@Accessors(chain = true)
public class Category {

    private String chId;
    private String name;
    private String slug;
    private int totalVideos;
    private String shortName;
    private String categoryUrl;
    private String coverUrl;

}
