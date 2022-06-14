package com.joyo.day05.part02_sort;

import java.util.Arrays;

public class BubblingSort {
    public static void main(String[] args) {
        // 1.定义数组
        int[] arr = {9, 5, 2, 7};

        // 2.定义循环，控制循环几轮
        for (int i = 0; i < arr.length - 1; i++) {
            // 3.定义内部循环，控制每轮循环几次
            for (int j = 0; j < arr.length - 1 - i; j ++) {
                // i = 0  j = 1 2 3
                // i = 1  j = 1 2
                // i = 2  j = 1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
