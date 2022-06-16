package part06_thread_synchronized_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;

    // final修饰后：锁对象是唯一和不可替换的，非常专业
    private final Lock lock = new ReentrantLock();

    public Account() {}

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public void withdraw(double money) {
        // 1.获取是谁来取钱
        String name = Thread.currentThread().getName();

        lock.lock(); // 上锁
        try {
            // 2.判断余额是否充足
            if (this.money >= money) {
                // 3.取钱
                System.out.println(name + "，恭喜你成功取钱 " + money + "元");
                // 4.更新余额
                this.money -= money;

                System.out.println(name + "，取款后余额剩余：" + this.money + "元");
            } else {
                System.out.println(name + "，余额不足！");
            }
        } finally {
            lock.unlock(); // 释放锁
        }
    }
}
