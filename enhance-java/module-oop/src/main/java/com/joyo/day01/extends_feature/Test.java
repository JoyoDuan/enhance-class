package com.joyo.day01.extends_feature;

class Animal {
    public static String food = "肉肉";

    private void eat() {
        System.out.println("动物都会吃东西...");
    }
}

class Dog extends Animal {

}

public class Test {
    public static void main(String[] args) {
        /**
         * 1.子类不能继承父类的构造器
         * 2.子类是否可以继承父类的私有成员？ 我认为是可以继承父类私有成员的，只是不能直接访问
         */
        Dog dog = new Dog();
//        dog.eat();
        // 3.子类是否可以继承父类的静态成员。 我认识不算继承的。只是共享的
        System.out.println(Dog.food);
    }
}
