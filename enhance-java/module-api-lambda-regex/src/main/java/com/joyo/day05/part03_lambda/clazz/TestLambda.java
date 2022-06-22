package com.joyo.day05.part03_lambda.clazz;

public class TestLambda {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//        System.out.println("*********************");

        Animal dog = new Animal() {
            @Override
            void eat() {
                System.out.println("狗爱吃骨头...");
            }
        };
        dog.eat();
        System.out.println("*********************");

//        Animal dog = () -> {
//            System.out.println("狗爱吃骨头...");
//        };
    }
}

//class Dog extends Animal {
//    @Override
//    void eat() {
//        System.out.println("狗爱吃骨头...");
//    }
//}

abstract class Animal {
    abstract void eat();
}
