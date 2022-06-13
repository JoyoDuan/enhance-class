package com.joyo.day03.part08_innerclass_anonymous;

/**
      目标：学习匿名内部类的形式和特点。
 */
public class Test {
    public static void main(String[] args) {
        // 匿名内部类
        Animal dog = new Animal() {
            @Override
            public void run() {
                System.out.println("狗跑得贼溜...");
            }
        };
        dog.run();
    }
}

// 常规写法
//class Dog extends Animal {
//    @Override
//    public void run() {
//        System.out.println("狗跑得贼溜...");
//    }
//}

abstract class Animal {
    public abstract void run();
}