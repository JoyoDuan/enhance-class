package com.joyo.day05.part02_sort;

/**
 * 目标：理解二分法查找的原理
 */
public class BinarySearchTest2 {
    public static void main(String[] args) {
        // 1.定义数组
        int[] arr = {1, 4, 7, 9, 15, 18, 20, 24, 28, 35, 39, 40};
        //           l                    m                   r

        System.out.println(binarySearch(arr, 20));
    }

    /**
     * 二分法查找
     * @param arr 数组
     * @param data 查找的数据
     * @return index 返回索引，元素不存在，返回-1
     */
    public static int binarySearch(int[] arr, int data) {
        // 1.定义左边 和 右边位置
        int left = 0;
        int right = arr.length - 1;

        // 2.开始循环，折半查找
        while (left <= right) {
            // 取中间索引
            int middleIndex = (left + right) / 2;

            // 3.判断当前中间位置元素和要找的元素的大小
            if (data > arr[middleIndex] ) {
                // 往右边找，左边位置更新 = 中间索引位置 + 1
                left = middleIndex + 1;
            } else if (data < arr[middleIndex]) {
                // 往左边找，右边位置更新 = 中间索引位置 - 1
                right = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1; // 没有找到元素
    }
}
