package com.joyo.day02.part08_abstract_template2;

public abstract class Article {

    public final void write() {
        System.out.println("标题：我的爸爸");
        System.out.println(writeContext());
        System.out.println("父爱如山");
    }

    public abstract String writeContext();
}
