package com.joyo.day02.part06_abstract_class;

public abstract class Animal {

    private String name;

    public abstract void run();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
