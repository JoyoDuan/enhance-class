package com.joyo.day01.singleton;


/**
 * 单例模式（饿汉）
 *
 * @author JoyoDuan
 * @date 2022/5/19
 */
public class EngerySingleInstance {
    private static EngerySingleInstance engerySingleInstance = new EngerySingleInstance();

    private EngerySingleInstance() {

    }

    public static EngerySingleInstance getInstance() {
        return engerySingleInstance;
    }
}
