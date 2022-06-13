package com.joyo.day01.static_code;


/**
 * 静态代码块
 *
 * @author JoyoDuan
 * @date 2022/5/19
 */
public class StaticCodeBlock {

    public static String schoolName;
    public String subSchoolName = "大数据学院";

    public StaticCodeBlock() {
        System.out.println("构造方法执行了...");
    }

    /**
     * 静态代码块：有static修饰，属于类，与类一起优先加载一次，自动触发执行
     * 作用：可以用于初始化静态资源。
     */
    static {
        System.out.println("执行了静态代码块...");
        schoolName = "云南理工职业学院";
    }

    public static void main(String[] args) {
        System.out.println("main方法执行...");
        System.out.println("学校名称：" + schoolName);

        StaticCodeBlock codeBlock1 = new StaticCodeBlock();
        System.out.println(codeBlock1.subSchoolName);
        StaticCodeBlock codeBlock2 = new StaticCodeBlock();
        System.out.println(codeBlock2.subSchoolName);
    }
}
