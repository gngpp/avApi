package pojo.videos;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 4:02 下午
 * amd
 * @author mac
 */
@Data
@Accessors(chain = true)
public class Video {
    private int vid;
    private int uid;
    private String title;
    private String keyword;
    private String channel;
    private double duration;
    private double framerate;
    private boolean hd;
    private long addTime;
    private int viewNumber;
    private int likes;
    private int dislikes;
    private String videoUrl;
    private String embeddedUrl;
    private String previewUrl;
    private String previewVideoUrl;
    private boolean privater;
}
