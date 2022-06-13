package com.joyo.day01.extends_field_method;

class Animal {
    public String name = "动物名";
    public void eat() {
        System.out.println("动物喜欢吃肉...");
    }
}

class Dog extends Animal {
    public String name = "二哈";

    public void call() {
        System.out.println("狗会叫...");
    }

    public void getName() {
        String name = "局部名";
        System.out.println(name);
        System.out.println(this.name); // 当前子类对象的name
        System.out.println(super.name); // 找父类的name

        super.eat(); // 找父类的方法
        eat(); // 子类的eat
    }

    public void eat() {
        System.out.println("狗爱吃老鼠...");
    }
}

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承后成员的访问特点：就近原则
        Dog dog = new Dog();
        dog.eat();
        dog.call();
        dog.getName();
    }
}
