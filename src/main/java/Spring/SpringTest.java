package Spring;

import Pojo.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringTest {
    public static void main(String[] args) {
       // BeanFactory ioc = new XmlBeanFactory(new FileSystemResource("D://......."));已经被弃用
//        spring提供两种方法获取ioc容器 BeanFactory   ApplicationContext
//        一般认为推荐开发人员使用ApplicationContext          BeanFactory主要是内部人员使用
//        同时引入配置文件也有两种放法ClassPathXmlApplicationContext      FileSystemXmlApplicationContext
//        ClassPathXmlApplicationContext为相对路径   FileSystemXmlApplicationContext为文件绝对路径
        BeanFactory ioc0 = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext ioc1 = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext ioc2 = new FileSystemXmlApplicationContext(
                "src\\main\\resources\\ApplicationContext.xml");
//通过容器获取到实例
        Student student= (Student) ioc1.getBean("student");
        Student student2= (Student) ioc2.getBean("student");
        student.sayHello();

        System.out.println(ioc0.getBean("student"));
        System.out.println(ioc1.getId());
        System.out.println(ioc2.getId());
    }
}
