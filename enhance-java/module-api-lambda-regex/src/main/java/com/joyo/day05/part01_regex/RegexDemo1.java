package com.joyo.day05.part01_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        // 要求：验证qq号码是否全部为数字，长度为6~20位
        System.out.println(checkQQ("1171534557"));
        System.out.println(checkQQ("a1171534557"));
        System.out.println(checkQQ("1234"));
        System.out.println(checkQQ(null));

        System.out.println("*******************************");

        System.out.println(checkQQWithRegular("1171534557"));
        System.out.println(checkQQWithRegular("a1171534557"));
        System.out.println(checkQQWithRegular("1234"));
        System.out.println(checkQQWithRegular(null));
    }

    /**
     * 校验qq号
     * @param qq
     * @return
     */
    public static boolean checkQQ(String qq) {
        // 1.判断qq号码长度是否满足要求
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }

        // 2.判断qq号码是否全部为数字，不是则返回false
        for (int i = 0; i < qq.length(); i ++) {
            // 获取每一位字符
            char ch = qq.charAt(i);
            // 判断字符是否为数字
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        return true;
    }

    /**
     * 使用正则表达式判断qq号是否符合规则
     * @return
     */
    public static boolean checkQQWithRegular(String qq) {
        return qq != null && qq.matches("\\d{6,20}");
    }
}
