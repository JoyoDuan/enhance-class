package com.joyo.day01.extends_constructor2;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("JoyoDuan", 28);
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
    }
}
