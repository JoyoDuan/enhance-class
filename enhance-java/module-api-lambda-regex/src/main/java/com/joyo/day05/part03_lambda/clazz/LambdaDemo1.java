package com.joyo.day05.part03_lambda.clazz;

/**
 * 目标：体会Lambda表达式的优越感
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
//        ManAndWomen manAndWomen = new ManAndWomen() {
//            @Override
//            public void run() {
//                System.out.println("男人走不动了...");
//            }
//        };
//        run(manAndWomen);
//        System.out.println("*******************************");
//
//        ManAndWomen manAndWomen1 = () -> {
//            System.out.println("女人贼TM能逛...");
//        };
//        run(manAndWomen1);

        run(new ManAndWomen() {
            @Override
            public void run() {
                System.out.println("男人被嫌弃了...");
            }
        });

        run(() -> {
            System.out.println("女人骂骂咧咧的继续逛...");
        });

        run(() -> System.out.println("男人和女人吵起来了..."));
    }

    public static void run(ManAndWomen manAndWomen) {
        System.out.println("开始逛街...");

        manAndWomen.run();

        System.out.println("结束逛街");
        System.out.println("-------------------------------------");
    }
}


@FunctionalInterface
interface ManAndWomen {
    void run();
}
