package resp.avtype;

/**
 * Create by Ant on 2020/3/12 3:20 下午
 * amd
 */
public class VideoCategory<VideoResponse> {
    private boolean success;
    private VideoResponse videoResponse;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public VideoResponse getVideoResponse() {
        return videoResponse;
    }

    public void setVideoResponse(VideoResponse videoResponse) {
        this.videoResponse = videoResponse;
    }

    @Override
    public String toString() {
        return "VideoCategory{" +
                "success=" + success +
                ", videoResponse=" + videoResponse +
                '}';
    }
}
