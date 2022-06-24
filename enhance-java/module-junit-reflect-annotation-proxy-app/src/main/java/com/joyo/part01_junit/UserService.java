package com.joyo.part01_junit;

public class UserService {
    /**
     * 用户登录
     */
    public String login(String userName, String password) {
        if ("admin".equals(userName) && "123456".equals(password)) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }

    public void selectUser() {
        System.out.println(10/2);
        System.out.println("查询全部用户成功");
    }
}
