package com.joyo.day02.part02_modifer.children;

import com.joyo.day02.part02_modifer.parent.Parent;

public class TestParent {
    public static void main(String[] args) {
        //创建Parent的对象，测试看有哪些方法可以使用
        Parent parent = new Parent();
        parent.showPublic();
    }
}
