package com.joyo.day02.part08_abstract_template;

public class Test {
    public static void main(String[] args) {
        CurrentAccount acc = new CurrentAccount("CCB-10086", 100000);
        acc.handle("JoyoDuan", "123456");
    }
}
