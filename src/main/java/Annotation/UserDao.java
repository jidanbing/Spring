package Annotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//@Component  使用此注解描述注入的bean，可以放到任意层
@Repository("userDao")//标识Dao层  与Component作用一样
public class UserDao {

    public void save(){
        System.out.println("userDao...save...");
    }
}
