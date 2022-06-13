package com.joyo.day01.static_base;

public class User {

    /**
     * 静态成员变量（类变量）
     *
     * static修饰的成员变量：静态成员变量，只在内存中有一份，可以被共享
     */
    public static int onlineNum = 50;

    public String name = "JoyoDuan";
    public int age = 28;

    public static void main(String[] args) {
        // 类名.静态成员变量
        System.out.println(User.onlineNum);

        // 对象名.实例成员变量
        User user = new User();
        System.out.println(user.name);
        System.out.println(user.age);

        user.onlineNum ++;

        User user1 = new User();
        System.out.println(user1.onlineNum + "********************");

//        System.out.println(user.onlineNum); // 不推荐
//        System.out.println(User.onlineNum); // 推荐方式
    }
}
