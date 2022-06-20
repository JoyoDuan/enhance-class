package com.joyo.day05.part01_arrays.clazz;

import java.util.Arrays;

// 目标：学会使用Arrays的API
public class ArraysTest1 {
    public static void main(String[] args) {
        // 1.定义一个数组
        int[] arr = {9, 5, 2, 7, 1, 8, 100, 20};

        System.out.println(arr);

        // 直接将数组转换为字符串
//        System.out.println(Arrays.toString(arr));

        // 默认排序规则：升序
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 使用默认的二分法查找元素
        // 条件：数组必须排过序
//        System.out.println(Arrays.binarySearch(arr, 8));
//        System.out.println(Arrays.binarySearch(arr, 2));

        System.out.println(Arrays.binarySearch(arr, 50));

    }
}
