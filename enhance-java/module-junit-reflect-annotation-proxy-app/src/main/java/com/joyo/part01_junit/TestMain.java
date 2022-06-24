package com.joyo.part01_junit;

public class TestMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String result = userService.login("admin", "123456");
        System.out.println(result);
    }
}
