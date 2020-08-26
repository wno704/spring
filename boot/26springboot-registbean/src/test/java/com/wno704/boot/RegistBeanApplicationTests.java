package com.wno704.boot;

import com.wno704.boot.test.config.WebConfig;
import com.wno704.boot.test.domain.User;
import com.wno704.boot.test.service.CalculateService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegistBeanApplicationTests {

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
        // 返回 IOC 容器，使用注解配置，传入配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        System.out.println("容器创建完毕");
        User user = context.getBean(User.class);
        System.out.println(user);

        // 查看 User 这个类在 Spring 容器中叫啥玩意
        String[] beanNames = context.getBeanNamesForType(User.class);
        Arrays.stream(beanNames).forEach(System.out::println);

        System.out.println("--------------------------------------");

        // 查看基于注解的 IOC容器中所有组件名称
        beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);

    }

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        // 查看基于注解的 IOC容器中所有组件名称
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.stream(beanNames).forEach(System.out::println);
    }

    @Test
    public void test2(){
        ConfigurableApplicationContext context1 = new SpringApplicationBuilder(RegistBeanApplication.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run();

        CalculateService service = context1.getBean(CalculateService.class);
        System.out.println("求合结果： " + service.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    public void test3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        Object cherry = context.getBean("cherryFactoryBean");
        System.out.println(cherry.getClass());

        Object cherryFactoryBean = context.getBean("&cherryFactoryBean");
        System.out.println(cherryFactoryBean.getClass());
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
