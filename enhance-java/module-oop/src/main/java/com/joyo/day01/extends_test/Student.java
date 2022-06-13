package com.joyo.day01.extends_test;


/**
 * 子类
 *
 * @author JoyoDuan
 * @date 2022/5/19
 */
public class Student extends People {

    /**
     * 独有行为
     */
    public void sleep() {
        System.out.println(getName() + "正在打瞌睡...");
    }
}
