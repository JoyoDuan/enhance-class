package com.joyo.day01.singleton;

/**
 * 单例（懒汉）
 *
 * @author JoyoDuan
 * @date 2022/5/19
 */
public class LazySingleInstance {
    private static LazySingleInstance instance = null;

    // 私有化构造器
    private LazySingleInstance() {

    }

    // 提供实例
    public synchronized static LazySingleInstance getInstance() {
        if (instance == null) {
            instance = new LazySingleInstance();
        }
        return instance;
    }
}
