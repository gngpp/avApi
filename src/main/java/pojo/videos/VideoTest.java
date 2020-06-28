package pojo.videos;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author mac
 */
@Data
@Accessors(chain = true)
public class VideoTest {
    private String title;
    private String keyword;
    private String channel;
    private double duration;
    private double framerate;
}
