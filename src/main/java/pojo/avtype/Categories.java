package pojo.avtype;

/**
 * Create by Ant on 2020/3/12 8:50 下午
 * amd
 */

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Copyright 2020 bejson.com
 */
@Data
@Accessors(chain = true)
public class Categories {

    private String CHID;
    private String name;
    private String slug;
    private int total_videos;
    private String shortname;
    private String category_url;
    private String cover_url;

}
