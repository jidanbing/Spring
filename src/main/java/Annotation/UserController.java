package Annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")//配置在Controller层  与Component作用一样
public class UserController {

    @Resource(name="userService")
    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("userController...save...");
    }
}
