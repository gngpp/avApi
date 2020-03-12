package test;

import api.ApiServiceFactory;

/**
 * Create by Ant on 2020/3/12 7:25 下午
 * amd
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(ApiServiceFactory.getService().getVideoCategory().getVideoResponse());
    }
}
