package com.joyo.day01.this_base;

public class Test {
    public static void main(String[] args) {
        // 目标：理解this(...)的作用：本类构造器中访问本类兄弟构造器。
        Student student = new Student("蜘蛛精", "花果山水帘洞学院");
        System.out.println(student.getName());
        System.out.println(student.getSchoolName());

        Student student1 = new Student("赵四");
        System.out.println(student1.getName());
        System.out.println(student1.getSchoolName());
    }
}
