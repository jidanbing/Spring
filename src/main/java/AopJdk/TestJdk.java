package AopJdk;

public class TestJdk {
    public static void main(String[] args) {
        //创建代理对象
        MyJdkProxy myJdkProxy = new MyJdkProxy();
        //创建目标对象
        UserService userService = new UserServiceImpl();
        //获取增强后的目标对象
        UserService userService2 =(UserService) myJdkProxy.createProxy(userService);
        //执行方法
        userService2.addUser();
    }
}
