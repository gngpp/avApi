package schema;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        final ExecutorService executorService = Executors.newFixedThreadPool(4);
        final Set<Integer> completeCheck= Collections.synchronizedSet(new HashSet<Integer>());
        for (int i = 0; i < 2899; i++) {
            executorService.submit(new Job(i,sqlSessionFactory.openSession(),completeCheck));
        }
        executorService.shutdown();
    }

}
