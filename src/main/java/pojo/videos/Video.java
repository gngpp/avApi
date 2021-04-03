package pojo.videos;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Create by Ant on 2020/3/12 4:02 下午
 * amd
 * @author mac
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class Video {
    private Integer vid;
    private Integer uid;
    private String title;
    private String keyword;
    private String channel;
    private Double duration;
    private Double framerate;
    private Boolean hd;
    private Long addtime;
    private Integer viewnumber;
    private Integer likes;
    private Integer dislikes;
    /**
     * video网址
     */
    private String videoUrl;
    /**
     * 嵌入式网址
     */
    private String embeddedUrl;
    /**
     * 预览url
     */
    private String previewUrl;
    /**
     * 预览video
     */
    private String previewVideoUrl;
    /**
     * 私密的
     */
    private boolean privater;
}
