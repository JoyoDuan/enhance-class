package part07_thread_communication;

public class CallCenter {
    // 记录当前呼入进来的电话
    private static int number = 0; // 最多只接听一个

    /**
     * 定义打电话方法
     */
    public synchronized static void call() {
        number ++;
        System.out.println("已经接入一个用户，等待分发");

        try {
            // 唤醒别人
            CallCenter.class.notify();
            // 让当前线程进入等待状态
            CallCenter.class.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 分发对象
     */
    public synchronized static void receive() {
        String name = Thread.currentThread().getName();

        try {
            if (number == 1) {
                System.out.println(name + "，电话已经分发给客服");

                // 客服接听电话中
                Thread.sleep(3000);
                System.out.println("客服已经接听完毕");

                number --;

                // 唤醒别人 : 1个
                CallCenter.class.notify();
                CallCenter.class.wait(); // 让当前线程等待
            } else {
                CallCenter.class.notify();
                CallCenter.class.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
