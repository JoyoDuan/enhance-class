package com.joyo.day05.part03_lambda.clazz;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标：把Arrays.sort()方法简化
 */
public class LamdbaDemo2 {

    public static void main(String[] args) {
        Integer[] arr = {9, 5, 2, 7, 1, 8, 10, 100, 200, 20};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // 降序
            }
        });
        System.out.println("第一次排序：*******************************");
        System.out.println(Arrays.toString(arr));


        // 使用Lambda表达式进行第一次简化
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2; // 升序
        });
        System.out.println("第二次排序：*******************************");
        System.out.println(Arrays.toString(arr));

        // 使用Lambda表达式进行第二次简化
        Arrays.sort(arr, (o1, o2) -> {
            return o2 - o1; // 降序
        });
        System.out.println("第三次排序：*******************************");
        System.out.println(Arrays.toString(arr));

        // 使用Lambda表达式进行第三次简化
        Arrays.sort(arr, (o1, o2) ->  o1 - o2);
        System.out.println("第三次排序：*******************************");
        System.out.println(Arrays.toString(arr));
    }
}
