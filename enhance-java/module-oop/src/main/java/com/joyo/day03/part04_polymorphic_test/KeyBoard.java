package com.joyo.day03.part04_polymorphic_test;

/**
   实现类（子类）
 */
public class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功的接入了设备~~~");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "成功的从设备弹出了~~~");
    }

    /**
      独有功能
     */
    public void keyDown(){
        System.out.println(name + "写下了：帅哥慢走，下次再来哦~~~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
