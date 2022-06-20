package com.joyo.day05.part01_arrays.clazz;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标：学会使用Comparator自定义排序规则
 */
public class ArraysTest2 {
    public static void main(String[] args) {

        Integer[] arr = {3, 1, 6, 4, 9, 20, 10, 30};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2; // 左边大于右边，返回正数：升序排序
                return - (o1 - o2); // 降序排序
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
