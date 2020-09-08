package AopCglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//工厂类  ： 用于生产代理类
public class MyCglibProxy implements MethodInterceptor {

    //实现MethodInterceptor接口并重写intercept方法
    //代理方法
    public Object createProxy(Object target){
        //创建一个动态类对象
        Enhancer enhancer = new Enhancer();
        //确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
        //添加回调函数
        enhancer.setCallback(this);
        //返回创建的代理类
        return enhancer.create();
    }

//重写MethodInterceptor的intercept方法
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
       //创建切面类对象
        LogRecord logRecord = new LogRecord();
        //前增强
       logRecord.start();
       //目标方法执行
       Object obj = methodProxy.invokeSuper(proxy,args);
       //后增强
       logRecord.close();

       return obj;
    }
}
