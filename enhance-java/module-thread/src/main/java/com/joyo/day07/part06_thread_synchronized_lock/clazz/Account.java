package com.joyo.day07.part06_thread_synchronized_lock.clazz;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    // 锁对象
    private final Lock lock = new ReentrantLock();

    private String cardId;
    private double money;

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     * 取钱操作
     */
    public void withdraw(double money) {
        // 谁取钱
        String name = Thread.currentThread().getName();

        try {
            // 上锁
            lock.lock();

            if (this.money >= money) {
                System.out.println(name + "取款成功，金额为：" + money + "元");

                // 更新账户余额
                this.money -= money;
                System.out.println("取款后余额为" + this.money);
            } else {
                System.out.println(name + "取钱失败了，余额不足！");
            }
        } finally {
            // 解锁
            lock.unlock();
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
