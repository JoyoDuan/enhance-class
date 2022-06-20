package com.joyo.day05.part02_sort.clazz;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubblingSort {
    public static void main(String[] args) {
        // 1.定义数组
        int[] arr = {9, 5, 2, 7};
        // i = 0   {5, 2, 7, 9}
        // i = 1   {2, 5, 7, 9}
        // i = 2   {}

        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0  j = 1 2 3
            // i = 1  j = 1 2
            // i = 2  j = 1
            for (int j = 0; j < arr.length - i - 1; j++) {
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
