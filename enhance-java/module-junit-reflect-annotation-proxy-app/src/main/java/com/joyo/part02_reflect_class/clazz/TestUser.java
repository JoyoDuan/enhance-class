package com.joyo.part02_reflect_class.clazz;

import org.junit.Test;


public class TestUser {
    @Test
    public void getUserClass() throws ClassNotFoundException {
        // 1.获取类的第一种方式
        // 要把类所在的包名都写上
        Class<?> clazz = Class.forName("com.joyo.part02_reflect_class.clazz.User");
        System.out.println(clazz);

        // 2.第二种
        Class<?> clazz1 = User.class;
        System.out.println(clazz1);

        // 2.第三种
        User user = new User();
        Class<?> clazz2 = user.getClass();
        System.out.println(clazz1);

    }
}
