package AspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect//用于定义一个切面
@Component
//切面类，在此类编写通知
public class MyAspect {

    //定义切入点表达式
    @Pointcut("execution(* AspectJ.*.*(..))")
    //使用一个返回值为空，方法体为空的方法来命名切入点
    private void myPointCut(){};

    @Before("myPointCut()")
    public void Before(JoinPoint joinPoint){
        System.out.println("前置通知...");
        System.out.println("目标类是:"+joinPoint.getTarget());
        System.out.println("被织入增强的方法是:"+joinPoint.getSignature().getName());
    }
    @AfterReturning("myPointCut()")
    public void AfterReturning(JoinPoint joinPoint){
        System.out.println("后置通知...");
        System.out.println("被织入增强的方法是:"+joinPoint.getSignature().getName());
    }
    //必须要有ProceedingJoinPoint类型参数
    //必须要返回Object类型
    //必须throws Throwable
    @Around("myPointCut()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("开始时环绕通知...");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("结束时环绕通知...");
        return obj;
    }
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void AfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知..."+e.getMessage());
    }
    @After("myPointCut()")
    public void After(){
        System.out.println("最终通知...");
    }

}
