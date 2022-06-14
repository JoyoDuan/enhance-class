package com.joyo.day04.part01_regex;

/**
 * 目标：正则表达式在方法中的应用
 *      public String[] split(String regex);
 *          -- 按照正则表达式匹配的内容进行分隔字符串，返回一个数组
 *      public String replaceAll(String regex, String newStr);
 *          -- 按照正则表达式匹配的内容进行替换
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        String name = "罗永浩asdfadf马云sadfasdf马化腾asdf刘强东";
        String[] arrs = name.split("\\w+");

        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        String names = name.replaceAll("\\w+", " ");
        System.out.println(names);
    }
}
