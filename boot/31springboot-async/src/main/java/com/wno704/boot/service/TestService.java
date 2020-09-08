package com.wno704.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class TestService {

    @Async("asyncThreadPoolTaskExecutor")
    public Future<String> asyncMethod2() {
        sleep();
        log.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
        return new AsyncResult<>("hello async");
    }

    @Async
    //@Async("asyncThreadPoolTaskExecutor")
    public void asyncMethod() {
        sleep();
        log.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
    }

    public void syncMethod() {
        sleep();
    }

    private void sleep() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}