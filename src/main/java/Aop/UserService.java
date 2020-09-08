package Aop;

public class UserService {

    public void addUser() {
        //System.out.println("开启日志记录");
        new LogRecord().start();
        System.out.println("这是添加用户的核心业务逻辑");
        new LogRecord().close();
        //System.out.println("日志记录的关闭");
    }
}
