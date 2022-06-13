package com.joyo.day02.part07_abstract_test;


/**
 * 抽象父类
 *
 * @author JoyoDuan
 * @date 2022/5/26
 */
public abstract class Card {

    private String name; // 卡主名称
    private double money;

    /**
     子类一定要支付的，但是每个子类支付的情况不一样，所以父类把支付定义成抽象方法，交给具体子类实现
     */
    public abstract void pay(double money);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
