package com.beijing.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringbootTaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    /**
     * 测试简单邮件发送
     */
    @Test
    void testMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("通知-开会");
        message.setText("今晚7点在7楼会议室开会！");
        message.setTo("331699962@qq.com");
        message.setFrom("442854399@qq.com");
        javaMailSender.send(message);
    }

    /**
     * 复杂邮件（带附件）
     */
    @Test
    void testMai2() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setSubject("通知-开会");
        helper.setText("<b style='color:red'>今晚7点7楼会议室开会</b>", true);
        helper.setTo("545233950@qq.com");
        helper.setFrom("442854399@qq.com");
        helper.addAttachment("1.jpg", new File("/Users/zuocheng/Downloads/大圣归来.jpg"));
        javaMailSender.send(mimeMessage);
    }

}
