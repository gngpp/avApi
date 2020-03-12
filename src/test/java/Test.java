import api.ApiServiceFactory;
import inteface.ApiService;
import sun.net.httpserver.HttpsServerImpl;
import sun.net.www.protocol.http.HttpURLConnection;
import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import java.io.IOException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

/**
 * Create by Ant on 2020/3/12 5:20 下午
 * amd
 */
public class Test {
    public static void main(String[] args) throws IOException {
      //  System.out.println(ApiServiceFactory.getService().getAllAV());
       // System.out.println(ApiServiceFactory.getService().getMovieCollction());
        System.out.println(ApiServiceFactory.getService().getVideoCategory());

    }
}
