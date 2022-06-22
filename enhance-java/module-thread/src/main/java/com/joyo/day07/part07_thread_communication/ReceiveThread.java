package com.joyo.day07.part07_thread_communication;

public class ReceiveThread extends Thread {
    @Override
    public void run() {
        while (true) {
            // 1号  2号
            CallCenter.receive();
        }
    }
}
