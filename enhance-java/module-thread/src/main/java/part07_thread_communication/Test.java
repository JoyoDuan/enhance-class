package part07_thread_communication;

public class Test {
    public static void main(String[] args) {
        // 生产者线程，不断接入电话
        CallThread callThread = new CallThread();
        callThread.start();

        // 消费者线程，每次一个客服接听
        ReceiveThread receiveThread = new ReceiveThread();
        receiveThread.start();
    }
}
