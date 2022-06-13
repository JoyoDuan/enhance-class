package com.joyo.day02.part08_abstract_template3;

public class Test {
    public static void main(String[] args) {
        SmallStudent smallStudent = new SmallStudent();
        // 父类中的模板方法
        smallStudent.outputComposition();

        MiddleStudent middleStudent = new MiddleStudent();
        middleStudent.outputComposition();
    }
}
