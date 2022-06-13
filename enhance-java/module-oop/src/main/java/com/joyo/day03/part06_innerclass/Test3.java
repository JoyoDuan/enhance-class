package com.joyo.day03.part06_innerclass;

public class Test3 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
