package Pojo;

public class Peoper {

    private String name;
    private int age;
    //使用静态工厂创建对象
    public static Peoper createBean() {
        System.out.println("使用静态工厂方式创建bean");
        return new Peoper();
    }

    public Peoper() {
        System.out.println("空参构造执行");
    }

    public Peoper(String name, int age) {
        super();
        this.name = name;
        this.age = age;
        System.out.println("有参构造执行");
    }
    public void init() {
        System.out.println("init初始化执行");
    }
    public void destory() {
        System.out.println("destory销毁执行");
    }
}
