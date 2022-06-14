package com.joyo.day04.part01_regex;

// 目标：体验正则表达式带来的乐趣
// 长度大于6，小于20
public class TestQQ {
    public static void main(String[] args) {
        // QQ: 1171534557
        // QQ: 12345
        // QQ: abc12345

        System.out.println(checkQQ("1171534557"));
        System.out.println(checkQQ("12345"));
        System.out.println(checkQQ("abc12345"));
        System.out.println(checkQQ(null));
        System.out.println("**************************************");

        System.out.println(checkQQWithRegex("1171534557"));
        System.out.println(checkQQWithRegex("12345"));
        System.out.println(checkQQWithRegex("abc12345"));
        System.out.println(checkQQWithRegex(null));
    }

    /**
     * 传统方式校验
     */
    public static boolean checkQQ(String qq) {
        // qq不符合要求
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        // 长度符合要求
        for (int i = 0; i < qq.length() - 1; i++) {
            // 判断所有字符是不是数字
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    // 使用正则表达式来校验QQ号码
    public static boolean checkQQWithRegex(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }
}
