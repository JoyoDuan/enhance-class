package com.joyo.day07.part07_thread_communication;


public class CallThread extends Thread {
    @Override
    public void run() {
        // 不断的打入电话
        while (true) {
            CallCenter.call();
        }
    }
}
