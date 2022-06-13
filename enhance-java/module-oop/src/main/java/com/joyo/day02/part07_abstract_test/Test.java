package com.joyo.day02.part07_abstract_test;

public class Test {
    public static void main(String[] args) {

//        GoldCard goldCard = new GoldCard();
//        goldCard.setMoney(1000);
//        goldCard.setName("JoyoDuan");
//        goldCard.pay(500);
//        System.out.println("余额：" + goldCard.getMoney());

        PlatinumCard platinumCard = new PlatinumCard();
        platinumCard.setName("吕福云");
        platinumCard.setMoney(500);
        platinumCard.pay(250);
        System.out.println("余额：" + platinumCard.getMoney());
    }
}
