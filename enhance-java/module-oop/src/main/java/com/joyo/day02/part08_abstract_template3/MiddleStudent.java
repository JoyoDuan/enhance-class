package com.joyo.day02.part08_abstract_template3;


public class MiddleStudent extends Composition {

    // 中学生写作文
    @Override
    public String writeContent() {
        return "我谈恋爱被" + getDidName() + "现场逮到，好尴尬...";
    }
}
