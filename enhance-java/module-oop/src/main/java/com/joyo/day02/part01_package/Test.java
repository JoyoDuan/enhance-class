package com.joyo.day02.part01_package;

import com.joyo.day02.part01_package.package1.Person;
import com.joyo.day02.part01_package.package1.Student;

public class Test {
    public static void main(String[] args) {
        // 导包：相同包下的类可以直接访问
        Teacher teacher = new Teacher();

        // 不同包下的类必须导包才可以使用
        Person person = new Person();

        // 使用默认导包的类：package1下的Student
        Student student = new Student();
        student.study();

        // 使用指定包下面的Student
        com.joyo.day02.part01_package.package2.Student student1 = new com.joyo.day02.part01_package.package2.Student();
        student1.study();
    }
}
