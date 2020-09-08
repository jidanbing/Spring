package Pojo;

public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private Student student;
//使用构造方法注入属性时，每一个参数就是一个依赖
    //set方法注入必须要有set方法
    public void setStudent(Student student) {
        this.student = student;
    }

    public void say(){
        this.student.sayHello();
        System.out.println("User");
    }


}
