package part04_thread_synchronized_code;


/**
 需求：模拟取钱案例。
 */
public class Test {
    public static void main(String[] args) {
        // 1、创建一个共享的账户对象
        Account account = new Account("CCB6217", 5000);

        new WithdrawThread(account, "老王").start();
        new WithdrawThread(account, "小莉").start();
    }
}
