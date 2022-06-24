package com.joyo.part01_junit;

import org.junit.*;

/**
 * 测试类
 */
public class TestUserService {

    // 修饰实例方法的
    @Before
    public void before() {
        System.out.println("TestUserService -> before执行...");
    }

    @After
    public void after() {
        System.out.println("TestUserService -> after执行...");
    }

    // 修饰静态方法
    @BeforeClass
    public static void beforeClass() {
        System.out.println("TestUserService -> beforeClass执行...");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("TestUserService -> afterClass执行...");
    }


    @Test
    public void abc() {
        UserService userService = new UserService();
        String res = userService.login("admin", "123456");
        System.out.println(res);

        // 断言：对预期结果的正确性进行测试
        Assert.assertEquals("您的登录业务可能出现问题", "登录成功", res);
    }

    @Test
    public void testSelectUser() {
        UserService userService = new UserService();
        userService.selectUser();
    }
}
