package com.joyo.day07.part05_thread_synchronized_method;


/**
 * 取钱的线程类
 */
public class WithdrawThread extends Thread {

    private Account account;

    public WithdrawThread() {}

    public WithdrawThread(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        // 取钱操作
        account.withdraw(5000);
    }
}
