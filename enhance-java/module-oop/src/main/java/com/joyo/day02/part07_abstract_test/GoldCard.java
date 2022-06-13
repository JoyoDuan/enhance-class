package com.joyo.day02.part07_abstract_test;

public class GoldCard extends Card {
    @Override
    public void pay(double money) {

        // 优惠后的金额
        double discount = money * 0.8;
        double lastMoney = getMoney() - discount;

        System.out.println(getName() + "，当前账户总金额：" + getMoney() +
                        "当前消费了：" + discount +
                        "消费后剩余余额：" + lastMoney);

        setMoney(lastMoney);
    }
}
