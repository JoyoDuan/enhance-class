package com.joyo.day07.part04_thread_synchronized_code.clazz;

/**
 * 取钱的线程
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
        this.account.withdraw(5000);
    }
}
