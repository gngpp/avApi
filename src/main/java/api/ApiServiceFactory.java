package api;

import inteface.impl.ApiServiceImpl;
import inteface.ApiService;
/**
 * Create by Ant on 2020/3/12 4:34 下午
 * amd
 * @author mac
 */
public class ApiServiceFactory {
    private static  ApiServiceImpl API;
    private ApiServiceFactory(){}
    public static ApiService getService() {
        if (API == null) {
            synchronized (ApiServiceFactory.class){
                if (API == null) {
                    API = new ApiServiceImpl();
                }
            }
        }
        return API;
    }
}
