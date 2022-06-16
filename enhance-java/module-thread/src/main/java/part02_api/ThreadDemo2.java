package part02_api;


/**
 * 目的：线程的API
 */
public class ThreadDemo2 {
    // main方法是由主线程负责调度的
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("输出：" + i);

            if (i == 2) {
                // 当前线程进入休眠状态
                // 客户不给钱就给他加上
                Thread.sleep(3000);
            }
        }
    }
}
