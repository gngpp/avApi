package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:20 下午
 * amd
 */
public class VideoCategory <VideoResponse>{
    private boolean success;
    private VideoResponse response;

    public boolean isSuccess() {
        return success;
    }

    public VideoCategory<VideoResponse> setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public VideoResponse getResponse() {
        return response;
    }

    public VideoCategory<VideoResponse> setResponse(VideoResponse response) {
        this.response = response;
        return this;
    }

    @Override
    public String toString() {
        return "VideoCategory{" +
                "success=" + success +
                ", response=" + response +
                '}';
    }
}
