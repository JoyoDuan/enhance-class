package com.joyo.part06_reflect_genericity;


import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestReflectGenericity {

    // 需求：反射实现泛型擦除后，加入其他类型的元素
    @Test
    public void testGenericity() throws Exception {
        ArrayList<String> lists1 = new ArrayList<>();
        ArrayList<Integer> lists2 = new ArrayList<>();

        System.out.println(lists1.getClass());
        System.out.println(lists2.getClass());

        System.out.println(lists1.getClass() ==  lists2.getClass());  // ArrayList.class
        System.out.println("**************************************");

        ArrayList<Integer> lists3 = new ArrayList<>();
        lists3.add(10);
        lists3.add(20);
//        lists3.add("JoyoDuan");

        Class clazz = lists3.getClass(); // ArrayList.class  ==> public boolean add(E e)
        Method add = clazz.getDeclaredMethod("add", Object.class);
        boolean result = (boolean) add.invoke(lists3, "男人");
        System.out.println(result);

        System.out.println(lists3);

        ArrayList list4 = lists3;
        list4.add("女人");
        list4.add(false);
        System.out.println(lists3);
    }
}
