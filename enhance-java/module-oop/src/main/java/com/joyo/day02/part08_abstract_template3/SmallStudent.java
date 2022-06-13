package com.joyo.day02.part08_abstract_template3;

public class SmallStudent extends Composition {

    // 小学生写作文
    @Override
    public String writeContent() {
        String content = "小学生啥也不会，但是会学Java...";
        return content;
    }
}
