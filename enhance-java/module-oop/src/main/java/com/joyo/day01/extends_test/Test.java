package com.joyo.day01.extends_test;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("紫霞仙子"); // 使用父类的
        student.setAge(20); // 使用父类的

        System.out.println(student.getName()); // 使用父类的
        System.out.println(student.getAge()); // 使用父类的

        student.eatMeat(); // 使用父类的
        student.sleep(); // 使用子类的
    }
}
