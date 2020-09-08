package Annotation;

import Pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ioc1 = new ClassPathXmlApplicationContext("Annottation.xml");
        UserController userController = (UserController) ioc1.getBean("userController");
        userController.save();
    }
}
