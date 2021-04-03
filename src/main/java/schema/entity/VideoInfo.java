package schema.entity;


import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * (VideoInfo)表实体类
 *
 * @author makejava
 * @since 2020-03-14 02:10:50
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class VideoInfo {

    private Integer id;

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

    private String videoUrl;

    private String embeddedUrl;

    private String previewUrl;

    private String previewVideoUrl;

    private Boolean privater;


}
