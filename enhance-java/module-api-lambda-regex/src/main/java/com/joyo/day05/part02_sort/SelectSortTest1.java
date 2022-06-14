package com.joyo.day05.part02_sort;

import java.util.Arrays;

/**
 * 目标：学会使用选择排序对数组进行排序
 */
public class SelectSortTest1 {
    public static void main(String[] args) {
        // 1.定义数组
        int[] arr = {9, 5, 2, 7};
        //           0  1  2  3

        // 2.定义循环控制循环多少轮
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0 j = 1 2 3
            // i = 1 j = 2 3
            // i = 2 j = 3

            // 3.定义内部循环，控制循环几次
            for (int j = i + 1; j < arr.length; j++) {
                // 当前位：arr[i]
                // 如果有比当前位小的数据，则交换
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
