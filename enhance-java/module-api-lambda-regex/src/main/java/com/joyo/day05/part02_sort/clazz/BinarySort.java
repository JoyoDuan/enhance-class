package com.joyo.day05.part02_sort.clazz;


import java.util.Arrays;

/**
 * 二分法查找
 */
public class BinarySort {

    public static void main(String[] args) {
        // 1.定义数组
        int[] arr = {2, 5, 9, 10, 80, 20, 1, 3, 7, 30, 50, 100, 200};
        //           l                    m                       r

        // 3.对数组排序
        Arrays.sort(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        // 排好序：[1, 2, 3, 5, 7, 9, 10, 20, 30, 50, 80, 100, 200]
        //         l                 m                          r

        System.out.println("它在：" + binarySearch(arr, 300));;
    }


    /**
     * 二分法查找
     *
     * @param arr
     * @param findNum
     * @return
     */
    public static int binarySearch(int[] arr, int findNum) {
        // 2.定义左边和右边
        int leftIndex = 0;
        int middleIndex = 0;
        int rightIndex = 0;

        rightIndex = arr.length -1;
        while (leftIndex <= rightIndex) {
            middleIndex = (leftIndex + rightIndex) / 2;

            // 判断查找的值是否比中间位置的值大，如果大，砍掉左边
            if (findNum > arr[middleIndex]) {
                leftIndex = middleIndex + 1;
            } else if (findNum < arr[middleIndex]) {
                rightIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }

        return -1;
    }
}
