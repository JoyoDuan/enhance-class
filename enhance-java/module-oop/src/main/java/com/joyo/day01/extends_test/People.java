package com.joyo.day01.extends_test;

public class People {
    private String name;
    private int age;

    public void eatMeat() {
        System.out.println(name + "在吃肉...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
