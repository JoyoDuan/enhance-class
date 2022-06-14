package com.joyo.day05.part01_arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用Arrays的常用API及其原理
        int[] arr = {2, 20, 1, 3, 10, 30};

        System.out.println(arr);

        // 1.返回数组的toString
        System.out.println(Arrays.toString(arr));

        System.out.println("*****************************************");

        // 2.排序的API（默认自动对数组进行升序排序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 3.二分搜索技术（前提必须排好序才支持，否则出bug）
        int index = Arrays.binarySearch(arr, 20);
        System.out.println(index);

        // 返回不存在元素的规律 （- 应该插入的位置 - 1）
        int index1 = Arrays.binarySearch(arr, 4);
        System.out.println(index1); // -4

        // 注意：如果数组没有排序，有可能找不到元素
        int[] arr1 = {1, 8, 0, 2, 100, 10, 9};
        int index2 = Arrays.binarySearch(arr, 8);
        System.out.println(index2);

    }
}
