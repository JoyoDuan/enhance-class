package com.joyo.part03_reflect_constructor;

public class Student {

    private String id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student() {
        System.out.println("执行了无参构造函数");
    }

    public Student(String id, String name) {
        System.out.println("执行了有参构造函数");
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
