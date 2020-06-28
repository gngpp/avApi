package inteface.parameter;

/**
 * 请求url参数
 * Create by Ant on 2020/3/12 10:39 下午
 * amd
 */
public class Parameter {

    /**
     *影片订购方法,DESC命令
     */

    public enum DESC{

        /**
         * 体重
         */
        LAST_VIEWED("bw"),
        /**
         * 最新
         */
        LATEST("mr"),
        /**
         * 最受欢迎
         */
        MOST_VIEWED("mv"),
        /**
         * 最高评分
         */
        TOP_RATED("tr"),
        /**
         * 最喜欢
         */
        MOST_FAVOURED("tf"),
        /**
         * 最长
         */
        LONGEST("lg");

        public String value;

        DESC(String value){
            this.value=value;
        }

    }

    /**
     * 大体时间，超过制定年龄的视频不会显示
     */
    public enum TIME{

        /**
         * 1天
         */
        DAY("t"),
        /**
         * 1周
         */
        WEEK("w"),
        /**
         * 1个月
         */
        MONTH("m"),
        /**
         * 永远
         */
        FOREVER("a");

        public String value;

        TIME(String value){
            this.value=value;
        }
    }

    /**
     * 显示私人或公共视频
     */
    public enum TYPE{

        /**
         * 公共
         */
        PUBLIC("public"),
        /**
         * 私人
         */
        PRIMARY("private");

        public String value;

        TYPE(String value){
            this.value=value;
        }
    }

    /**
     *
     */
    public enum CHID{

        AV_ACTRESS(1), AV_JAPAN(2), NO_CORRECTION(3),
        GIRL(4), AMATEUR(5), ANAL(6),
        BREASTS(7), COSPLAY(8), SCHOOL_LIFE(9),
        ONE_WIFE(10), RIPE_FEMALE(11), SM(12),
        CHINA(13), HONG_KONG(14), JAPAN(15),
        KOREA(16), TAIWAN(17), ASIAN(18),
        WESTERN(19), D3(20), VR(21),
        IDOL(22), MOVIE_18(23), ANIME(24);

        public int value;
        CHID(int value){
            this.value=value;
        }
    }

}
