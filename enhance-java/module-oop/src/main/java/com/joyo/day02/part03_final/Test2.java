package com.joyo.day02.part03_final;

public class Test2 {
    public static void main(String[] args) {
        // final修饰变量的注意事项
        // 1、final修饰基本类型变量，其数据不能再改变
        final double rate = 3.14;
        // rate = 3.15; // 第二次赋值，报错

        // 2、final修饰引用数据类型的变量，变量中存储的地址不能被改变，但是地址指向的对象内容可以改变。
        final int[] arr = {1, 2, 3};
        System.out.println(arr);
        System.out.println(arr[1]);
        // arr = null; // 属于第二次赋值，arr中的地址不能被改变
        arr[1] = 20;
        System.out.println(arr);
        System.out.println(arr[1]);
    }
}
