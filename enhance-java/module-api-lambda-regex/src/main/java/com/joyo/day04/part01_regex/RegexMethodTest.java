package com.joyo.day04.part01_regex;


// 目标：学会在方法中使用正则表达式
public class RegexMethodTest {

    public static void main(String[] args) {
        String nameStr = "马化腾asdfasd12233马云32423fdsf刘强东123_sdf雨蒙";

        String[] names = nameStr.split("\\w+");

        for (int i = 0; i < names.length - 1; i++) {
            System.out.println(names[i]);
        }

        String newStr = nameStr.replaceAll("\\w+", " ");
        System.out.println(newStr);
    }

}
