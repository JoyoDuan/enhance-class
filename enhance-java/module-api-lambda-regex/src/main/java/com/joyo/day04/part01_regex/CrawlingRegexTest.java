package com.joyo.day04.part01_regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 目标：从很长很长的数据中爬取出电话号码、邮箱、座机
 */
public class CrawlingRegexTest {
    public static void main(String[] args) {
        String bigStr = "欢迎来到德莱联盟,电话0871-7766008，或者联系邮箱" +
                "JoyoDuan@163.com,电话18083831850，08717742008" +
                "邮箱JoyoDuan@163.com，400-100-0000 ，08717742007";

        // 1.定义正则
        String regex = "(1[3-9]\\d{9})|" +
                "(\\w{2,20}@[a-zA-Z0-9]{2,6}.[a-zA-Z0-9]{2,6}[.&&\\w^_]?)|" +
                "(\\d{3,4}-?\\d{5,8})";

        // 2.编译规则
        Pattern pattern = Pattern.compile(regex);

        // 3.匹配内容，获取比较器
        Matcher matcher = pattern.matcher(bigStr);

        // 4.通过比较器获取结果
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
