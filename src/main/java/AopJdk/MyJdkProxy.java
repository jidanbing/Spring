package AopJdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//Jdk动态代理必须要有接口
//工厂类  ： 用于生产代理类
public class MyJdkProxy implements InvocationHandler {

    //实现InvocationHandler接口并重写invoke方法

    //声明目标类接口
    private UserService userService;

    //Jdk代理方法
    public Object createProxy(UserService userService){
        this.userService=userService;
        //1.类加载器
        ClassLoader classLoader = MyJdkProxy.class.getClassLoader();
        //2.被代理对象实现的所有接口
        Class[] clazz = userService.getClass().getInterfaces();
        //3.使用代理类，进行增强，返回的是处理后的对象
        return Proxy.newProxyInstance(classLoader,clazz,this);
    }

    //实现InvocationHandler接口并重写invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //声明切面
        LogRecord logRecord =new LogRecord();
        //前增强
        logRecord.start();
        //在目标类调用方法，并传入参数
        Object obj = method.invoke(userService,args);
        //后增强
        logRecord.close();
        return obj;
    }
}
