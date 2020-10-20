package com.beijing.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步任务  @Async + @EnableAsync
 * @Author zc217
 * @Date 2020/10/20
 */
@Service
public class AsyncTaskService {

    public void dataHandle(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据处理....");
    }

    /**
     * spring识别 异步方法
     */
    @Async
    public void dataHandle2(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据处理....");
    }
}
