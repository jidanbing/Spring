package AopCglib;

public class TestCglib {
    public static void main(String[] args) {
        //创建代理对象
        MyCglibProxy myCglibProxy = new MyCglibProxy();
        //创建目标对象
        UserService userService1 = new UserService();
        //获取增强后的目标对象
        UserService userService2 =(UserService) myCglibProxy.createProxy(userService1);
        //执行方法
        userService2.addUser();
    }
}
