package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:26 下午
 * amd
 */
public class VideoTypeInfo {
    private Integer CHID;
    private String  name;
    private String slug;
    private Integer total_videos;
    private String category_url;
    private String cover_url;

    @Override
    public String toString() {
        return "VideoTypeInfo{" +
                "CHID=" + CHID +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", total_videos=" + total_videos +
                ", category_url='" + category_url + '\'' +
                ", cover_url='" + cover_url + '\'' +
                '}';
    }

    public Integer getCHID() {
        return CHID;
    }

    public VideoTypeInfo setCHID(Integer CHID) {
        this.CHID = CHID;
        return this;
    }

    public String getName() {
        return name;
    }

    public VideoTypeInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public VideoTypeInfo setSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public Integer getTotal_videos() {
        return total_videos;
    }

    public VideoTypeInfo setTotal_videos(Integer total_videos) {
        this.total_videos = total_videos;
        return this;
    }

    public String getCategory_url() {
        return category_url;
    }

    public VideoTypeInfo setCategory_url(String category_url) {
        this.category_url = category_url;
        return this;
    }

    public String getCover_url() {
        return cover_url;
    }

    public VideoTypeInfo setCover_url(String cover_url) {
        this.cover_url = cover_url;
        return this;
    }
}
