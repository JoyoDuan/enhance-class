package com.joyo.day01.static_util;

import java.util.Random;

public class VerifyCodeUtil {

    /**
     注意：由于工具类无需创建对象，所以把其构造器私有化会显得很专业！
     */
    private VerifyCodeUtil(){
    }

    public static String generateVerifyCode(int length) {
        // 定义字符串
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 定义验证码
        String verifyCode = "";

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(str.length());
            verifyCode += str.charAt(index);
        }
        return verifyCode;
    }
}
