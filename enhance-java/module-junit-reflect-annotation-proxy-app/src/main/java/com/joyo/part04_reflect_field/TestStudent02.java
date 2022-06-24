package com.joyo.part04_reflect_field;


import org.junit.Test;

import java.lang.reflect.Field;

/**
 目标：反射获取成员变量: 取值和赋值。

 Field的方法：给成员变量赋值和取值
 void set(Object obj, Object value)：给对象注入某个成员变量数据
 Object get(Object obj):获取对象的成员变量的值。
 void setAccessible(true);暴力反射，设置为可以直接访问私有类型的属性。
 Class getType(); 获取属性的类型，返回Class对象。
 String getName(); 获取属性的名称。
 */
public class TestStudent02 {

    @Test
    public void setField() throws NoSuchFieldException, Exception {
        // a.反射第一步，获取类对象
        Class c = Student.class;
        // b.提取某个成员变量
        Field ageField = c.getDeclaredField("age");

        ageField.setAccessible(true); // 暴力打开权限

        Student student = new Student();
        // c.赋值
        ageField.set(student, 28); // 相当于student.setAge(28);

        // d、取值
        int age = (int) ageField.get(student);
        System.out.println(age);
    }
}
