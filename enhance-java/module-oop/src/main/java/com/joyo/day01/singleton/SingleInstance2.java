package com.joyo.day01.singleton;


/**
 * 单例（懒汉式）
 *
 * @author JoyoDuan
 * @date 2022/5/19
 */
public class SingleInstance2 {
    /**
     * 私有化构造器
     */
    private SingleInstance2() {}

    /**
     * 定义一个静态的成员变量负责存储一个对象
     * 只加载一次，只有一份
     */
    private static SingleInstance2 instance = null;


    /**
     * 提供一个方法，对外返回单例对象
     */
    public static SingleInstance2 getInstance() {
        if (instance == null) {
            instance = new SingleInstance2();
        }
        return instance;
    }
}
