package Spring;

import Pojo.Peoper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryTestStatic {
    public static void main(String[] args) {
        ApplicationContext ioc1 = new ClassPathXmlApplicationContext("Factory.xml");
        Peoper pop = (Peoper) ioc1.getBean("peoper");
        System.out.println(pop);

        Peoper pop2 = (Peoper) ioc1.getBean("peoper2");
        System.out.println(pop2);


        System.out.println("..............");
        Peoper pop3 = (Peoper) ioc1.getBean("peo");
        System.out.println(pop3);
        //手动执行销毁方法
        pop3.destory();
        //销毁之后手动关闭容器
       // ioc1.close();
    }
}
