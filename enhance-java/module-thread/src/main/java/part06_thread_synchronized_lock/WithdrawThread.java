package part06_thread_synchronized_lock;

public class WithdrawThread extends Thread {

    private Account account;

    public WithdrawThread() {}

    public WithdrawThread(Account account, String name) {
        super(name);
        this.account = account;
    }


    @Override
    public void run() {
        account.withdraw(5000);
    }
}
