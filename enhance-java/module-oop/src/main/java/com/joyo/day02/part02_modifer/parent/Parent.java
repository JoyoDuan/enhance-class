package com.joyo.day02.part02_modifer.parent;

public class Parent {
    // 1.private 只能本类中访问
    private void showPrivate() {
        System.out.println("private");
    }

    // 2.缺省：本类，同一个包下的类中。
    void showDefault() {
        System.out.println("缺省");
    }

    // 3.protected：本类，同一个包下的类中，其他包下的子类
    protected void showProtected() {
        System.out.println("protected");
    }

    // 4.任何地方都可以
    public void showPublic() {
        System.out.println("public");
    }


    public static void main(String[] args) {
        //创建Parent的对象，测试看有哪些方法可以使用
        Parent parent = new Parent();
        parent.showPrivate();
        parent.showDefault();
        parent.showProtected();
        parent.showPublic();
    }
}
