package com.joyo.day04.part01_regex;

import java.util.Scanner;

/**
 * 目标：通过正则表达式校验手机号码、邮箱、座机号码
 */
public class FormatRegexTest {
    public static void main(String[] args) {
        // 手机号：18083831850
        // 手机号码：12345678910
        // 手机号码：1808383185
//        checkPhone();

        // 邮箱：1171534557@qq.com
        // JoyoDuan@163.com
        // Yangzhou@fox.com.cn
        // Yangzhou#fox.com.cn
//        checkEmail();

        // 座机：0871-7766008
        // 021-423156
        // 010-6431547
        // 4006431547
        // 010--6431547
        checkMobile();
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入手机号码：");

        while (true) {
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("手机号码输入成功！");
                break;
            }
            System.out.println("手机号码输入不正确");
        }
    }

    // 邮箱：1171534557@qq.com
    // Joyo_Duan@163.com
    // Yangzhou@fox.com.cn
    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入邮箱：");

        while (true) {
            String phone = sc.next();
            if (phone.matches("\\w{3,30}@[\\w^_]{1,6}.[a-zA-Z0-9]{2,6}.[a-zA-Z0-9]*")) {
                System.out.println("邮箱输入成功！");
                break;
            }
            System.out.println("邮箱输入不正确");
        }
    }


    // 座机：0871-7766008
    // 021-423156
    // 010-6431547
    // 4006431547
    public static void checkMobile() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入座机号码：");

        while (true) {
            String phone = sc.next();
            if (phone.matches("\\d{3,4}-?\\d{5,8}")) {
                System.out.println("座机输入成功！");
                break;
            }
            System.out.println("座机输入不正确");
        }
    }
}
