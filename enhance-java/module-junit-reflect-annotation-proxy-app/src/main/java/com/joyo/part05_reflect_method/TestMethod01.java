package com.joyo.part05_reflect_method;


import org.junit.Test;

import java.lang.reflect.Method;

/**
 目标：反射——获取Method方法对象

 反射获取类的Method方法对象：
 1、Method getMethod(String name,Class...args);
 根据方法名和参数类型获得对应的方法对象，只能获得public的

 2、Method getDeclaredMethod(String name,Class...args);
 根据方法名和参数类型获得对应的方法对象，包括private的

 3、Method[] getMethods();
 获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的

 4、Method[] getDeclaredMethods();
 获得类中的所有成员方法对象，返回数组,只获得本类申明的方法。

 Method的方法执行：
 Object invoke(Object obj, Object... args)
 参数一：触发的是哪个对象的方法执行。
 参数二： args：调用方法时传递的实际参数
 */
public class TestMethod01 {

    /**
     * 1.获得类中的所有成员方法对象
     */
    @Test
    public void getDeclaredMethods() {
        // a.获取类对象
        Class clazz = People.class;
        // b.提取全部方法；包括私有的
        Method[] methods = clazz.getDeclaredMethods();
        // c.遍历全部方法
        for (Method method : methods) {
            System.out.println(method.getName() + " 返回值类型：" + method.getReturnType() + " 参数个数：" + method.getParameterCount());
        }
    }

    /**
     * 2. 获取某个方法对象
     */
    @Test
    public void getDeclaredMethod() throws Exception {
        // a.获取类对象
        Class clazz = People.class;

        // b.提取单个方法对象
        Method method = clazz.getDeclaredMethod("eat");
        Method method2 = clazz.getDeclaredMethod("eat", String.class);

        // 暴力打开权限
        method.setAccessible(true);
        method2.setAccessible(true);

        // c.执行方法
        People people = new People();
        Object result = method.invoke(people);
        System.out.println(result);

        Object result2 = method2.invoke(people, "豆腐");
        System.out.println(result2);
    }
}
