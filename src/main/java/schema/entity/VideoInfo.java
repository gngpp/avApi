package schema.entity;


import lombok.Data;
import lombok.experimental.Accessors;

/**
 * (VideoInfo)表实体类
 *
 * @author makejava
 * @since 2020-03-14 02:10:50
 */
@Data
@Accessors(chain = true)
public class VideoInfo {

    private Integer id;

    private Integer vid;

    private Integer uid;

    private String title;

    private String keyword;

    private String channel;

    private Object duration;

    private Object framerate;

    private Boolean hd;

    private Object addtime;

    private Integer viewnumber;

    private Integer likes;

    private Integer dislikes;

    private String videoUrl;

    private String embeddedUrl;

    private String priviewUrl;

    private String previewVideoUrl;

    private Boolean privatee;


}