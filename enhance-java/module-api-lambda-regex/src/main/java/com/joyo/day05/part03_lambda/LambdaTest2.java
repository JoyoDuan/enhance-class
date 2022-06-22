package com.joyo.day05.part03_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest2 {
    public static void main(String[] args) {
        Integer[] arr = {34, 12, 42, 23};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // 降序
            }
        });
        System.out.println("第一次排序：" + Arrays.toString(arr));

        System.out.println("---------------------------");


        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1; // 降序
        });
        System.out.println("第二次排序：" + Arrays.toString(arr));

        System.out.println("---------------------------");

        Arrays.sort(arr, (o1, o2) -> {
            return o2 - o1; // 降序
        });
        System.out.println("第三次排序：" + Arrays.toString(arr));

        System.out.println("---------------------------");

        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println("第四次排序：" + Arrays.toString(arr));
    }
}
