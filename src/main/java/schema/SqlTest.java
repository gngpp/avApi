package schema;

import api.ApiServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.videos.Video;
import schema.entity.VideoInfo;
import schema.mapper.VideoInfoDao;
import java.io.InputStream;
import java.sql.*;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class SqlTest {

    private static String resource="mybatis-config.xml";
    public static SqlSessionFactory getSqlSessionFactory(){
        try (InputStream inputStream= Resources.getResourceAsStream(resource)){
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        insert();
    }

    public static void insert(){
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        final ExecutorService executorService = Executors.newFixedThreadPool(7);
        for (int i = 0; i < 2899; i++) {
            executorService.submit(new Job(i,sqlSessionFactory.openSession(),new HashSet<Integer>()));
        }
    }

}
