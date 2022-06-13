package com.joyo.day01.extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 目标：认识继承后子类构造器的特点
        // 特点：子类的全部构造器默认会先访问父类的无参数构造器再执行自己
        Dog dog = new Dog();
        System.out.println(dog);

        System.out.println("**********");

        Dog dog1 = new Dog("二哈");
        System.out.println(dog1);
    }
}
