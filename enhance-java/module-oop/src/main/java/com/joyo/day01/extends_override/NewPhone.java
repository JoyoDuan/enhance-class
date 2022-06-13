package com.joyo.day01.extends_override;

public class NewPhone extends Phone {
    // 重写的方法
    // @Override重写校验注解，加上之后，这个方法必须是正确重写的，这样更安全。2、提高程序的可读性，代码优雅
    // 重写方法的名称和形参列表必须与被重写的方法一模一样
    @Override
    public void call() {
        System.out.println("视频通话功能~");
        super.call(); // 先用它爸爸的基本功能
    }

    @Override
    public void sendMsg() {
        System.out.println("发送图片、语音功能~");
        super.sendMsg(); // 先用它爸爸的基本功能
    }

    // 静态方法不能被重写
//    @Override
//    public static void test() {
//
//    }
}
