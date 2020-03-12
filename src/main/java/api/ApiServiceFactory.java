package api;

import impl.ApiServiceImpl;
import inteface.ApiService;

/**
 * Create by Ant on 2020/3/12 4:34 下午
 * amd
 */
public class ApiServiceFactory {
    private static ApiServiceImpl API;
    private ApiServiceFactory(){}
    public static ApiService getService(){
        synchronized (ApiServiceFactory.class){
            if (API==null){
                API=new ApiServiceImpl();
            }
            return API;
        }
    }
}
