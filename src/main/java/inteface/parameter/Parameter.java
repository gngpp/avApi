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

        LAST_VIEWED("bw"),    //体重
        LATEST("mr"),         //最新
        MOST_VIEWED("mv"),    //最受欢迎
        TOP_RATED("tr"),      //最高评分
        MOST_FAVOURED("tf"),  //最喜欢
        LONGEST("lg");         //最长

        public String value;

        DESC(String value){
            this.value=value;
        }

    }

    /**
     * 大体时间，超过制定年龄的视频不会显示
     */
    public enum TIME{

        DAY("t"),             //1天
        WEEK("w"),            //1周
        MONTH("m"),           //1个月
        FOREVER("a");         //永远

        public String value;

        TIME(String value){
            this.value=value;
        }
    }

    /**
     * 显示私人或公共视频
     */
    public enum TYPE{

        PUBLIC("public"),         //公共
        PRIMARY("private");      //私人

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
