package com.joyo.day03.part03_polymorphic_convert;

public class Tortoise extends Animal {
    public String name = "δΉιΎ";

    @Override
    public void run() {
        System.out.println("π’θ·ηιεΈΈζ’~~~");
    }

    /**
     η¬ζεθ½
     */
    public void layEggs(){
        System.out.println("π’ε¨δΈθ~~~");
    }
}
