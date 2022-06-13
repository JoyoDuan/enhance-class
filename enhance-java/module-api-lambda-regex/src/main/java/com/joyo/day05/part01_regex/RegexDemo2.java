package com.joyo.day05.part01_regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        // public boolean matches(String regex); 判断是否与正则表达式匹配，匹配返回true

        // 只能是a b c
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));

        // 不能出现a b c
        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));

        System.out.println("a".matches("\\d"));
        System.out.println("3".matches("\\d"));
        System.out.println("333".matches("\\d"));
        System.out.println("z".matches("\\w"));
        System.out.println("2".matches("\\w"));
        System.out.println("21".matches("\\w"));
        System.out.println("你".matches("\\w"));
        System.out.println("你".matches("\\W")); // 大写W
        System.out.println("******************************************");
        // 以上正则匹配职能校验单个字符

        // 校验密码
        // 必须是数字、字母、下划线、至少6为
        System.out.println("jjd2wq".matches("\\w{6,}"));
        System.out.println("jjdwq".matches("\\w{6,}"));
        System.out.println("jjdwqa211我屮艸芔茻".matches("\\w{6,}"));
        System.out.println("******************************************");

        // 验证，必须是数字和字符，必须是4位
        System.out.println("asd2".matches("[a-zA-z0-9]{4}"));
        System.out.println("Asd2".matches("[a-zA-z0-9]{4}"));
        System.out.println("Asd2f".matches("[a-zA-z0-9]{4}"));
        System.out.println("Asd2".matches("[\\w&&[^_]]{4}"));
    }
}
