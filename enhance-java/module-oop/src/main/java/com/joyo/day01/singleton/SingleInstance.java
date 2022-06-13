package com.joyo.day01.singleton;


/**
 * 单例（饿汉模式）
 *
 * @author JoyoDuan
 * @date 2022/5/19
 */
public class SingleInstance {

    /**
     * 饿汉单例是在获取对象前，对象已经提前准备好了一个
     * 这个对象只能是一个，所以定义静态成员变量
     */
    private static SingleInstance singleInstance = new SingleInstance();

    /**
     * 必须把构造器私有
     */
    private SingleInstance() {}

    public static SingleInstance getInstance() {
        return singleInstance;
    }
}
