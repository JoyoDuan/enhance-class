package com.joyo.day01.static_code;


import java.util.ArrayList;

/**
 * 扑克牌
 *
 * @author JoyoDuan
 * @date 2022/5/19
 */
public class Poker {

    // 定义一个静态的集合，这样这个集合只加载 一个。因为当前房间只需要一副牌
    public static ArrayList<String> cards = new ArrayList<>();

    // 在程序真正运行main方法前，把54张牌放进去吧，后续游戏可以直接使用了
    static {
        // 定义扑克牌
        String[] words = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 花色
        String[] colors = {"♠", "♥", "♣", "♦"};

        // 一张牌
        String card = "";
        // 遍历扑克牌
        for (int i = 0; i < words.length; i++) {
            // 遍历花色
            for (int j = 0; j < colors.length; j++) {
                card = words[i] + colors[j];
                cards.add(card);
            }
        }

        // 单独加入大王小王
        cards.add("大卍");
        cards.add("小卍");
    }

    public static void main(String[] args) {
        // 模拟游戏启动前，初始化54张牌数据。
        System.out.println("新牌：" + cards);
        System.out.println("新牌的数量：" + cards.size());
    }
}
