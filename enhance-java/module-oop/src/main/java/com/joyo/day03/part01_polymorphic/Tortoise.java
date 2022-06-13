package com.joyo.day03.part01_polymorphic;

public class Tortoise extends Animal {
    public String name = "乌龟";

    @Override
    public void run() {
        System.out.println("🐢跑的贼慢~~~");
    }
}
