package AopJdk;

public class UserServiceImpl implements UserService{

    /**
     * 常规操作 会导致硬编码。不利于后期代码的维护以及升级、复用等，，，，此时我们可以采取aop代理
     * 切入点 ：实际被增强的方法
     * 连接点 ：可能会被增强的方法       连接点包含切入点
     * 目标对象 ：被增强的类
     */
    //切入点
    public void addUser() {

        System.out.println("这是添加用户的核心业务逻辑");

    }
}
