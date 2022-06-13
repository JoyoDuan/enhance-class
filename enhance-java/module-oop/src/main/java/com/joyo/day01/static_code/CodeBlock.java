package com.joyo.day01.static_code;

public class CodeBlock {

    private final String name;

    public CodeBlock() {
        System.out.println("无参构造器执行了...");
    }

    /**
     * 实例代码块，属于对象，每次构建对象时，都会触发一次执行
     */
    {
        System.out.println("代码块执行了...");
        name = "JoyoDuan";
    }

    public static void main(String[] args) {
        CodeBlock codeBlock1 = new CodeBlock();
        System.out.println(codeBlock1.name);

        CodeBlock codeBlock2 = new CodeBlock();
        System.out.println(codeBlock2.name);
    }
}
