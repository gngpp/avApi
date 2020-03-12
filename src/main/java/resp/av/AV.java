package resp.av;

import lombok.Data;
import lombok.experimental.Accessors;
import org.omg.CORBA.INTERNAL;

/**
 * Create by Ant on 2020/3/12 4:02 下午
 * amd
 */
@Data
@Accessors(chain = true)
public class AV {
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
    private String video_url;
    private String embedded_url;
    private String preview_url;
}
