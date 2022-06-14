package com.joyo.day05.part01_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 目标：自定义数组的排序规则，Comparator比较器
        // 需求：降序排序（自定义比较器，只能支持引用类型）
        Integer[] arr = {20, 30, 10, 18, 28};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 指定比较器规则
//                return 01 - o2; // 默认升序
                return o2 - o1; // 降序排序
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
