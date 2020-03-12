package inteface.parameter;

/**
 * Create by Ant on 2020/3/12 10:39 下午
 * amd
 */
public class Parameter {

    /**
     *影片订购方法,DESC命令
     */
    public enum DESC{
        LAST_VIEWED,    //体重
        LATEST,         //最新
        MOST_VIEWED,    //最受欢迎
        TOP_RATED,      //最高评分
        MOST_FAVOURED,  //最喜欢
        LONGEST         //最长
    }

    /**
     * 大体时间，超过制定年龄的视频不会显示
     */
    public enum TIME{
        DAY,            //1天
        WEEK,           //1周
        MONTH,          //1个月
        FOREVER         //永远
    }

    /**
     * 显示私人或公共视频
     */
    public enum TYPE{
        PUBLIC,         //公共
        PRIMARY         //私人
    }

    /**
     * 视频类别内的视频
     */
    public enum CHID{
        ONE,            //有效视频类别的CHID整数1
        TWO,            //有效视频类别的CHID整数2
        THREE           //有效视频类别的CHID整数3
    }
}
