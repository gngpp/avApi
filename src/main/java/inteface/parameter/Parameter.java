package inteface.parameter;

/**
 * 请求url参数
 * Create by Ant on 2020/3/12 10:39 下午
 * amd
 * @author mac
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

        /**
         * 演员
         */
        AV_ACTRESS(1),

        /**
         * 日本
         */
        AV_JAPAN(2),

        /**
         * 无修正
         */
        NO_CORRECTION(3),

        /**
         * 少女
         */
        GIRL(4),

        /**
         * 业余
         */
        AMATEUR(5),

        /**
         * 口。。。
         */
        ANAL(6),

        /**
         * xio
         */
        BREASTS(7),

        /**
         * copyplay
         */
        COSPLAY(8),

        /**
         * 校园
         */
        SCHOOL_LIFE(9),

        /**
         * 人妻
         */
        ONE_WIFE(10),

        /**
         * 熟女
         */
        RIPE_FEMALE(11),

        /**
         * Sm
         */
        SM(12),

        /**
         * china
         */
        CHINA(13),

        /**
         * hk
         */
        HONG_KONG(14),

        /**
         * 日本
         */
        JAPAN(15),

        /**
         * 韩国
         */
        KOREA(16),

        /**
         * tw
         */
        TAIWAN(17),

        /**
         * 亚洲
         */
        ASIAN(18),

        /**
         * 欧美
         */
        WESTERN(19),

        /**
         * 3D
         */
        D3(20),

        /**
         * VR
         */
        VR(21),

        /**
         * 偶像
         */
        IDOL(22),

        /**
         * 18禁
         */
        MOVIE_18(23),

        /**
         * 动漫
         */
        ANIME(24);

        public int value;
        CHID(int value){
            this.value=value;
        }
    }

}
