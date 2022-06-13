package com.joyo.day02.part02_modifer.children;

import com.joyo.day02.part02_modifer.parent.Parent;

public class Children extends Parent {

    public static void main(String[] args) {
        //创建Children的对象，测试看有哪些方法可以使用
        Children children = new Children();
        children.showProtected();
        children.showPublic();
    }
}
