package com.joyo.day02.part02_modifer.parent;

public class Test {

    public static void main(String[] args) {

        //创建Parent的对象，测试看有哪些方法可以使用
        Parent parent = new Parent();

        // 私有的
//        parent.showPrivate();
        parent.showDefault();
        parent.showProtected();
        parent.showPublic();
    }
}
