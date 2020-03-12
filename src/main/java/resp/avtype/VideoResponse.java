package resp.avtype;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by Ant on 2020/3/12 3:44 下午
 * amd
 */

public class VideoResponse<VideoCategoryList> {
    private VideoCategoryList categoryList;

    @Override
    public String toString() {
        return "VideoResponse{" +
                "categoryList=" + categoryList +
                '}';
    }

    public VideoCategoryList getCategoryList() {
        return categoryList;
    }

    public VideoResponse<VideoCategoryList> setCategoryList(VideoCategoryList categoryList) {
        this.categoryList = categoryList;
        return this;
    }
}

