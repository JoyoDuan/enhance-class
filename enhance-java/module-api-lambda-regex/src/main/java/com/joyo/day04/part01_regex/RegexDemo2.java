package com.joyo.day04.part01_regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        // public boolean matches(String regex); 判断是否与正则表达式匹配，匹配返回true

        // 只能是a b c
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]")); // false

        // 不能出现a b c
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("z".matches("[^abc]")); // true

        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d") + "###########"); // false
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\w")); // false
        System.out.println("你".matches("\\W")); // 大写W // true
        System.out.println("******************************************");
        // 以上正则匹配职能校验单个字符

        // 校验密码
        // 必须是数字、字母、下划线、至少6为
        System.out.println("jjd2wq".matches("\\w{6,}")); // true
        System.out.println("jjdwq".matches("\\w{6,}")); // false
        System.out.println("jjdwqa211我屮艸芔茻".matches("\\w{6,}")); // false
        System.out.println("******************************************");

        // 验证，必须是数字和字符，必须是4位
        System.out.println("asd2".matches("[a-zA-z0-9]{4}")); // true
        System.out.println("Asd2".matches("[a-zA-z0-9]{4}")); // true
        System.out.println("Asd2f".matches("[a-zA-z0-9]{4}")); // false
        System.out.println("Asd2".matches("[\\w&&[^_]]{4}")); // true
        System.out.println("Ad_2".matches("[\\w&&[^_]]{4}")); // false
    }
}
