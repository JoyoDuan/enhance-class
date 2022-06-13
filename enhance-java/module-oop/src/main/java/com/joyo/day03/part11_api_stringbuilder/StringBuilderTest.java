package com.joyo.day03.part11_api_stringbuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        sb.append("e");

        System.out.println(sb.toString());
        System.out.println(sb);

        // 字符串反转
        String rSb = sb.reverse().toString();

        System.out.println(rSb);

        sb.append(110).append("隔壁老王").append(true);

        System.out.println(sb);
    }
}
