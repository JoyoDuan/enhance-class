package com.joyo.day02.part07_abstract_test;

public class PlatinumCard extends Card {
    @Override
    public void pay(double money) {

        double discount = money * 0.5;
        double lastMoney = getMoney() - discount;

        System.out.println(getName() + "消费前总金额：" + getMoney());
        System.out.println("当前消费金额：" + discount);
        System.out.println("消费后的余额：" + lastMoney);

        setMoney(lastMoney);
    }
}
