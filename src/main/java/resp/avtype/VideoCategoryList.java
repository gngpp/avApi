package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 3:24 下午
 * amd
 */

public class VideoCategoryList<VideoTypeInfo> {
    private List<VideoTypeInfo> infos;

    public List<VideoTypeInfo> getInfos() {
        return infos;
    }

    public VideoCategoryList<VideoTypeInfo> setInfos(List<VideoTypeInfo> infos) {
        this.infos = infos;
        return this;
    }

    @Override
    public String toString() {
        return "VideoCategoryList{" +
                "infos=" + infos +
                '}';
    }
}
