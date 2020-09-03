package com.wno704.boot;

import com.wno704.boot.test.config.WebConfig;
import com.wno704.boot.test.model.Dept;
import com.wno704.boot.test.model.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BeanLifeCycleApplicationTests {

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("--------------------------------------");
    }

    @Before
    public void beforeTest() {
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }


    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        System.out.println("容器创建完毕");
        User user = context.getBean(User.class);
        // 关闭 IOC 容器
        context.close();
    }

    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        System.out.println("容器创建完毕");
        // 关闭 IOC 容器
        context.close();
    }

    @After
    public void afterTest() {
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("--------------------------------------");
    }

}
