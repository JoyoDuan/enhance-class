package com.joyo.day05.part03_lambda.clazz;

/**
 * 目标：学会Lambda表达式的基本写法
 */
public class TestLambda2 {
    public static void main(String[] args) {
        People people = new People() {
            @Override
            public void run() {
                System.out.println("男人跑得贼TM块...");
            }
        };
        people.run();
        System.out.println("**********************");

        People people1 = () -> {
            System.out.println("男人跑得贼TM块...");
        };
        people1.run();
    }
}


@FunctionalInterface // 函数式接口，加上该注解以后，职能有一个方法存在接口中
interface People {
    void run();
}
