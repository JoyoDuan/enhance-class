package com.joyo.day01.singleton;

public class Test2 {
    public static void main(String[] args) {
//        SingleInstance2 instance2 = SingleInstance2.getInstance();
//        SingleInstance2 singleInstance2 = SingleInstance2.getInstance();
//        System.out.println(instance2 == singleInstance2);

        EngerySingleInstance engerySingleInstance1 = EngerySingleInstance.getInstance();
        EngerySingleInstance engerySingleInstance2 = EngerySingleInstance.getInstance();
        System.out.println(engerySingleInstance1 == engerySingleInstance2);

    }
}
