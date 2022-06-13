package com.joyo.day03.part03_polymorphic_convert;

public class Dog extends Animal {
    public String name = "狗";

    @Override
    public void run() {
        System.out.println("🐕跑的贼溜~~~~~");
    }

    /**
      独有功能
     */
    public void lookDoor(){
        System.out.println("🐕在看🚪！！！");
    }
}
