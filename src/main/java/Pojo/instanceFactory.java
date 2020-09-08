package Pojo;

public class instanceFactory {
    //生成bean的方法
    public Peoper instanceMethod() {
        System.out.println("使用实例工厂生成bean");
        return new Peoper();
    }
}
