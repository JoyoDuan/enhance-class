package com.joyo.day03.part03_polymorphic_convert;

public class Tortoise extends Animal {
    public String name = "乌龟";

    @Override
    public void run() {
        System.out.println("🐢跑的非常慢~~~");
    }

    /**
     独有功能
     */
    public void layEggs(){
        System.out.println("🐢在下蛋~~~");
    }
}
