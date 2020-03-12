package api;

import impl.ApiServiceImpl;
import inteface.ApiService;
import resp.avtype.Categories;

import java.util.List;

/**
 * Create by Ant on 2020/3/12 4:34 下午
 * amd
 */
public class ApiServiceFactory {
    private static  ApiServiceImpl API;
    private ApiServiceFactory(){}
    public static ApiService getService() {
            if (API == null) {
                API = new ApiServiceImpl();
            }
                return API;
    }

    public static void main(String[] args) {
        List<Categories> categories=ApiServiceFactory.getService().getVideoCategory().getResponse().getCategories();
        for (Categories categories1:categories){
            System.out.println(categories1);
        }

    }
}
