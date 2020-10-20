package com.beijing.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 定时任务
 * @Author zc217
 * @Date 2020/10/20
 */
@Service
public class ScheduledService {

    //  on the second, minute, hour, day of month, month, and day of week.
    //  "0 * * * * MON-FRI"
    @Scheduled(cron = "0,1,2 * * * * MON-FRI")
    public void schedulePrint(){
        System.out.println("定时任务打印输出schedulePrint.......");
    }
}
