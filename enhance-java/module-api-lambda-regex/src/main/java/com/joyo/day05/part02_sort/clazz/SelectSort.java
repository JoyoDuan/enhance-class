package com.joyo.day05.part02_sort.clazz;


import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        // 1.定义数组
        int[] arr = {9, 5, 2, 7};
        //           0  1  2  3

        int temp = 0;
        // 2.控制循环多少轮
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0  j = 1 2 3
            // i = 1  j = 2 3
            // i = 2  j = 3
            // 3.控制循环次数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
