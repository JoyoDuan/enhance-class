package com.joyo.day01.this_base;

public class Student {
    private String name;
    private String schoolName;

    public Student() {
    }

    public Student(String name, String schoolName) {
//        super(); // 必须先初始化父类，再初始化自己。
        this.name = name;
        this.schoolName = schoolName;
    }

    public Student(String name) {
        this(name, "云南理工职业学院");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
