package com.joyo.day01.static_base;

public class Student {

    // 实例成员变量：无static修饰，属于对象
    private String name;

    /**
     * 静态成员方法: 有static修饰，归属于类，可以被共享访问，用类名或者对象名都可以访问
     */
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }

    /**
     实例方法:属于对象的，只能用对象触发访问
     */
    public void study(){
        System.out.println(name + "今天买了一台电脑~");
    }

    public static void main(String[] args) {
        // 类名.静态成员方法
        System.out.println(Student.getMax(28, 19));
        // 注意：同一个类中，访问静态方法，类名可以省略不写。
        System.out.println(getMax(10, 32));

        // 2、对象.实例方法
        Student s = new Student();
        s.name = "疯狂的老王";
        s.study();

        // 对象.静态方法 (语法是可行，但是不推荐)
        System.out.println(s.getMax(13,34));
    }
}
