package com.joyo.day07.part05_thread_synchronized_method.clazz;

public class Account {

    private String cardId;
    private double money;

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     * 取钱操作
     */
    public synchronized void withdraw(double money) {
        // 谁取钱
        String name = Thread.currentThread().getName();

        if (this.money >= money) {
            System.out.println(name + "取款成功，金额为：" + money + "元");

            // 更新账户余额
            this.money -= money;
            System.out.println("取款后余额为" + this.money);
        } else {
            System.out.println(name + "取钱失败了，余额不足！");
        }
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
