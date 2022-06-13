package com.joyo.day03.part05_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        inner.setName("内部类");
        inner.setAge(999);

        System.out.println(inner.getName());;
    }
}
