package com.joyo.day05.part03_lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        People people = new People() {
            @Override
            public void run() {
                System.out.println("男人跑得贼TM溜...");
            }
        };
        people.run();

        People people1 = () -> {
            System.out.println("女人跑得贼慢...");
        };
        people1.run();

        System.out.println("*****************************");

        // 逛街
        People people2 = () -> { System.out.println("男人累的一批..."); };
        shopping(people2);

        shopping(() -> {
            System.out.println("女人意犹未尽...");
        });
    }

    public static void shopping(People people) {
        System.out.println("开始逛街...");

        people.run();

        System.out.println("逛街结束...");
        System.out.println("---------------------------");
    }
}

interface People {
    void run();
}