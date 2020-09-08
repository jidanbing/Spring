package Spring;

import Pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiTest {
//依赖注入有两种set方法注入，构造参数注入
    public static void main(String[] args) {
        //bean的生命周期
        /**
         * 1.通过构造器创建bean的实例
         * 2.为bean的属性设置值和对其他bean的引用
         * 3.调用bean的初始化方法
         * 4.使用bean
         * 5.当容器关闭时，调用bean的销毁方法
         */
        ApplicationContext ioc1 = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User)ioc1.getBean("user");
        user.say();
    }


}
