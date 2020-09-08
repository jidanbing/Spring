package AopJdk;

//日志记录功能
public class LogRecord {

    /**
     * 增强  ：在切入点处要执行的代码（方法）
     * 织入 ：将增强应用到切入点的过程叫做织入
     * 代理类： 织入之后会产生一个代理类，一般此代理类是目标类的子类
     * 切面 ： 增强  +  切入点  组成了切面
     */

    //增强
    public void start() {
        System.out.println("JdkProxy日志记录的开启");
    }
    //增强
    public void close() {
        System.out.println("JdkProxy日志记录的关闭");
    }
}
