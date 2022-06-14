package com.joyo.day04.part01_regex;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        // 目标：校验手机号码 邮箱 电话号码
//        checkPhone();
//        checkEmail();
        checkTelPhone();
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入11位手机号码：");
            String phone = sc.next();
            // 判断输入的手机号码格式是否正确
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("恭喜！手机号码输入正确！");
                break;
            } else {
                System.out.println("手机号码格式不正确！");
            }
        }
    }

    // JoyoDuan@163.com
    // 1171534557@qq.com
    // 1171534557@abc.com.cn
    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入邮箱：");
            String email = sc.next();
            // 判断输入的手机号码格式是否正确
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("恭喜！邮箱输入正确！");
                break;
            } else {
                System.out.println("邮箱格式不正确！");
            }
        }
    }

    // 0871-7766008
    // 021-7766008
    // 0217766008
    public static void checkTelPhone() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入座机号码：");
            String tel = sc.next();
            // 判断输入的手机号码格式是否正确
            if (tel.matches("0\\d{2,6}-?\\d{5,20}")) {
                System.out.println("恭喜！座机号码输入正确！");
                break;
            } else {
                System.out.println("座机号码格式不正确！");
            }
        }
    }
}
