package com.joyo.part05_reflect_method;

public class People {
    private String name;

    public People() {}

    public People(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("人跑得一般");
    }

    private void eat(){
        System.out.println("人爱吃肉");
    }

    private String eat(String name) {
        System.out.println("男人在吃" + name);
        return "吃的很开心！";
    }

    public static void inHouse(){
        System.out.println("王先生在家里偷偷搞事情");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
