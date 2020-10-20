package com.beijing.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync // 开启异步注解@Async
@EnableScheduling // 开启定时注解 @Scheduled
@SpringBootApplication
public class SpringbootTaskApplication {

    // 邮件任务 MailSenderAutoConfiguration自动配置
    // 1.MailSenderJndiConfiguration中JavaMailSenderImpl
    // 2.邮件属性 MailProperties
    public static void main(String[] args) {
        SpringApplication.run(SpringbootTaskApplication.class, args);
    }

}
