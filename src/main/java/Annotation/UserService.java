package Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")//配置在service层      与Component作用一样
public class UserService {

    //@Qualifier//默认使用实例名字装配
    //@Autowired//默认使用实例类型装配
    @Resource(name="userDao")//指定name,则按照实例名字装配；指定type，则按照实例类型装配；跟Autowired作用一样
    private UserDao userDao;

    public void save(){
        this.userDao.save();
        System.out.println("userService...save...");
    }

}
