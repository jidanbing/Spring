package AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("Spring_AspectJ.xml");
        UserDao userDao= (UserDao) ioc.getBean("userDao");
        userDao.add();
    }
}
