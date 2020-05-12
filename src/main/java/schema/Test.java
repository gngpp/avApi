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

public class Test {

    public static SqlSessionFactory getSqlSessionFactory(){
        String resource = "mybatis-config.xml";
        try (InputStream inputStream= Resources.getResourceAsStream(resource)){
            return new SqlSessionFactoryBuilder().build(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory=getSqlSessionFactory();
        final int i1 = Runtime.getRuntime().availableProcessors();
        final ExecutorService executorService = Executors.newFixedThreadPool(i1);
        final Set<Integer> completeCheck= Collections.synchronizedSet(new HashSet<Integer>());
        for (int i = 0; i < 3000; i++) {
            assert sqlSessionFactory != null;
            executorService.submit(new Job(i,sqlSessionFactory.openSession(),completeCheck));
        }
        executorService.shutdown();
    }
}
