package com.joyo.day01.singleton;

public class Test1 {
    public static void main(String[] args) {
//        SingleInstance instance1 = SingleInstance.getInstance();
//        SingleInstance instance2 = SingleInstance.getInstance();
//
//        System.out.println(instance1 == instance2);

        LazySingleInstance singleInstance1 = LazySingleInstance.getInstance();
        LazySingleInstance singleInstance2 = LazySingleInstance.getInstance();

        System.out.println(singleInstance1 == singleInstance2);
    }
}
