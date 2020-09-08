package SpringJdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class JdbcTest {


    @Test
    public void mainTest() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("Spring_Jdbc.xml");
        //获取JdbcTemplate实例
        JdbcTemplate jdbcTemplate =(JdbcTemplate) ioc.getBean("jdbcTemplate");
        //使用execute（）方法执行SQL语句
        jdbcTemplate.execute("select * from user ");
        System.out.println("1");
    }
}
