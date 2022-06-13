package com.joyo.day02.part08_abstract_template3;

public abstract class Composition {

    private final String didName = "隔壁老王";

    public String getDidName() {
        return didName;
    }

    // 作文的标题
    private final String title = "他爹";
    private final String firstPart = "第一段";
    private final String footer = "最后一段";

    // 模板方法
    public final void outputComposition() {
        System.out.println("作文标题: " + title);
        System.out.println(firstPart);

        // 作文内容，让子类自己去写
        System.out.println(writeContent());

        System.out.println("作文的最后：" + footer);

        System.out.println("**************************************");
    }

    // 学生书写正文
    public abstract String writeContent();
}
