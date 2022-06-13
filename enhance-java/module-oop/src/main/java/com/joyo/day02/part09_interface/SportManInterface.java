package com.joyo.day02.part09_interface;

/**
   接口
 */
public interface SportManInterface {
    // 接口中的成员：JDK 1.8之前只有常量 和 抽象方法
    // public static final 可以省略不写，接口默认会为你加上！
    // public static final String SCHOOL_NAME = "云南理工";
    String SCHOOL_NAME = "云南理工";

    // 2、抽象方法
    //  public abstract 可以省略不写，接口默认会为你加上！
    // public abstract void run();
    void run();

    // public abstract void eat();
    void eat();
}
