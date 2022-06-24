package com.joyo.part02_reflect_class;


import org.junit.Test;


/**
 * 目标：学会使用反射
 */
public class TestReflect {
    @Test
    public void testReflect() throws ClassNotFoundException {
        // 1、Class类中的一个静态方法：forName(全限名：包名 + 类名)
        Class<?> clazz = Class.forName("com.joyo.part02_reflect_class.Student");
        System.out.println(clazz);

        // 2.类名.class
        Class<?> clazz1 = Student.class;
        System.out.println(clazz1);

        // 3.对象.getClass()
        Student student = new Student();
        Class<?> clazz2 = student.getClass();
        System.out.println(clazz2);
    }
}
