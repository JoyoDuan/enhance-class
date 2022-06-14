package com.joyo.day04.part01_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式爬取信息中的内容
 */
public class RegexDemo4 {
    public static void main(String[] args) {
        String result = "欢迎来到德莱联盟,电话0871-7766008，或者联系邮箱" +
            "JoyoDuan@163.com,电话18083831850，08717742008" +
            "邮箱JoyoDuan@163.com，400-100-0000 ，08717742007";

        // 需求：从上面的信息中爬取出 电话号码、邮箱
        // 1.定义爬取规则
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|" +
                "(1[3-9]\\d{9})|" +
                "(0\\d{2,6}-?\\d{5,20})|" +
                "(400-?\\d{3,9}-?\\d{3,9})";
        // 2.把这个规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        // 3.得到一个内容匹配器
        Matcher matcher = pattern.matcher(result);

        // 4.开始根据规则找到匹配的内容
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
