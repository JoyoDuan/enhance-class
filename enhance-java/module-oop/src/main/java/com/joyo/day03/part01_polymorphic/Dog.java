package com.joyo.day03.part01_polymorphic;

public class Dog extends Animal {
    public String name = "狗";

    @Override
    public void run() {
        System.out.println("🐕跑的贼溜~~~~~");
    }
}
