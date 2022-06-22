package com.joyo.day05.part03_lambda.clazz;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            public void eat(String oli) {
                System.out.println("奔驰吃的是" + oli + "号汽油...");
            }
        };
        car.eat("98");

        Car car1 = (String oli) -> {
            System.out.println("马自达吃的是" + oli + "号汽油...");
        };
        car1.eat("92");

        Car car2 = (String oli) -> System.out.println("马自达吃的是" + oli + "号汽油...");
        car1.eat("92");

        Car car3 = (oli) -> System.out.println("特斯拉吃的是" + oli + "号汽油...");
        car1.eat("电");

        Car car4 = o -> System.out.println("凯迪拉克吃的是" + o + "号汽油...");
        car1.eat("95");
    }
}

interface Car {
    // 汽车要加油
    void eat(String oli);
}
