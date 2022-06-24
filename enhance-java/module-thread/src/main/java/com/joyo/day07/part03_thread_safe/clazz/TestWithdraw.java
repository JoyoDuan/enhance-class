package com.joyo.day07.part03_thread_safe.clazz;

public class TestWithdraw {
    public static void main(String[] args) {
        Account account = new Account("CCB-110", 5000);

        WithdrawThread withdrawThread = new WithdrawThread(account, "王树奇");
        withdrawThread.start();

        WithdrawThread withdrawThread1 = new WithdrawThread(account, "小丽");
        withdrawThread1.start();

        WithdrawThread withdrawThread2 = new WithdrawThread(account, "小宝贝");
        withdrawThread2.start();
    }
}
