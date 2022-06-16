package part03_thread_safe;

public class Account {
    private String cardId;
    private double money; // 账户的余额

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /**
     * 取钱操作
     */
    public void withdraw(double money) {
        // 1.先获取线程名，就是用户名
        String name = Thread.currentThread().getName();

        // 2.判断余额是否充足
        if (this.money >= money) {
            // 3.取款成功
            System.out.println(name + "，恭喜你成功取款 " + money + "元");

            // 4.更新余额
            this.money -= money;
            System.out.println(name + "，您的余额还剩：" + this.money + "元");
        } else {
            System.out.println(name + "，对不起！余额不足");
        }
    }
}
