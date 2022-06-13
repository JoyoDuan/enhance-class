package com.joyo.day03.part07_innerclass;

public class People {
    private int heartbeat = 150;

    public class Heart {
        private int heartbeat = 120;

        public void show() {
            int heartbeat = 80;

            System.out.println(heartbeat); // 80
            System.out.println(this.heartbeat); // 120
            System.out.println(People.this.heartbeat); // 150
        }
    }

    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}
