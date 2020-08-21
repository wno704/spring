package com.wno704.boot.listener;

import com.wno704.boot.model.User;
import com.wno704.boot.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
/*
 * 监听 Servlet 上下文对象
 */
@Component
public class MyServletContextListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 先获取到 application 上下文
        ApplicationContext applicationContext = event.getApplicationContext();
        // 获取对应的 service
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.getUser();
        // 获取 application 域对象，将查到的信息放到 application 域中
        ServletContext application = applicationContext.getBean(ServletContext.class);
        application.setAttribute("user", user);
    }
}
