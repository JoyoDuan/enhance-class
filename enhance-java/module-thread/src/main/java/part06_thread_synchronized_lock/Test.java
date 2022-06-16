package part06_thread_synchronized_lock;

public class Test {

    public static void main(String[] args) {
        Account account = new Account("CCB110", 5000);

        new WithdrawThread(account, "老王").start();
        new WithdrawThread(account, "妮子").start();
    }
}
