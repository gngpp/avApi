import api.ApiServiceFactory;
import inteface.ApiService;

/**
 * Create by Ant on 2020/3/12 5:20 下午
 * amd
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(ApiServiceFactory.getService().getAllAV());
        System.out.println(ApiServiceFactory.getService().getMovieCollction());
        System.out.println(ApiServiceFactory.getService().getVideoCategory());
    }
}
