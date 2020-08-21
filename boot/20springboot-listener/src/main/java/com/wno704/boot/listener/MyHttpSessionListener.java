package com.wno704.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 使用 HttpSessionListener 统计在线用户数的监听器
 * 监听 HTTP 会话 Session 对象
 */
@Component
@Slf4j
public class MyHttpSessionListener implements HttpSessionListener {
    /**
     * 记录在线的用户数量
     */
    public Integer count = 0;
    @Override
    public synchronized void sessionCreated(HttpSessionEvent httpSessionEvent) {
        log.info("新用户上线了");
        count++;
        httpSessionEvent.getSession().getServletContext().setAttribute("count", count);
    }

    @Override
    public synchronized void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        log.info("用户下线了");
        count--;
        httpSessionEvent.getSession().getServletContext().setAttribute("count", count);
    }
}
