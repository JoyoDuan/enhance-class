package com.joyo.part04_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 目标：反射_获取Field成员变量对象。

 反射的第一步是先得到Class类对象。

 1、Field getField(String name);
 根据成员变量名获得对应Field对象，只能获得public修饰
 2.Field getDeclaredField(String name);
 根据成员变量名获得对应Field对象，只要申明了就可以得到
 3.Field[] getFields();
 获得所有的成员变量对应的Field对象，只能获得public的
 4.Field[] getDeclaredFields();
 获得所有的成员变量对应的Field对象，只要申明了就可以得到
 小结：
 获取全部成员变量：getDeclaredFields
 获取某个成员变量：getDeclaredField
 */
public class TestStudent01 {

    /**
     * 1.获取全部的成员变量。
     * Field[] getDeclaredFields();
     *  获得所有的成员变量对应的Field对象，只要申明了就可以得到
     */
    @Test
    public void getDeclaredFields() {
        Class<?> clazz = Student.class;
        // b.定位全部成员变量
        Field[] fields = clazz.getDeclaredFields();
        // c.遍历一下
        for (Field field : fields) {
            System.out.println(field.getName() + " ==> " + field.getType());
        }
    }

    @Test
    public void getDeclaredField() throws NoSuchFieldException {
        // a.定位Class对象
        Class<?> clazz = Student.class;
        // b.根据名称定位某个成员变量
        Field field = clazz.getDeclaredField("age");
        System.out.println(field.getName() +" ==> " + field.getType());

        Field field1 = clazz.getDeclaredField("COUNTTRY");
        System.out.println(field1.getName() +" ==> " + field1.getType());
    }
}
