package com.wno704.boot.controller;

import com.wno704.boot.model.MailDO;
import com.wno704.boot.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private JavaMailSender jms;

    @Autowired
    private MailService mailService;

    @Value("${spring.mail.username}")
    private String from;

    @RequestMapping("sendSimpleEmail")
    public String sendSimpleEmail() {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo("wno704@qq.com"); // 接收地址
            message.setSubject("一封简单的邮件"); // 标题
            message.setText("使用Spring Boot发送简单邮件。"); // 内容
            jms.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("sendHtmlEmail")
    public String sendHtmlEmail() {
        MimeMessage message = null;
        try {
            message = jms.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("wno704@qq.com"); // 接收地址
            helper.setSubject("一封HTML格式的邮件"); // 标题
            // 带HTML格式的内容
            StringBuffer sb = new StringBuffer("<p style='color:#6db33f'>使用Spring Boot发送HTML格式邮件。</p>");
            helper.setText(sb.toString(), true);
            jms.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("sendAttachmentsMail")
    public String sendAttachmentsMail() {
        MimeMessage message = null;
        try {
            message = jms.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("wno704@qq.com"); // 接收地址
            helper.setSubject("一封带附件的邮件"); // 标题
            helper.setText("详情参见附件内容！"); // 内容
            // 传入附件  this.getClass().getResourceAsStream("/static/计算机词汇.scel");
            //FileSystemResource file = new FileSystemResource(new File("/static/计算机词汇.scel"));
            helper.addAttachment("计算机词汇.scel", ResourceUtils.getFile("classpath:static/计算机词汇.scel"));
            jms.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping("sendInlineMail")
    public String sendInlineMail1() {
        MimeMessage message = null;
        try {
            message = jms.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("wno704@qq.com"); // 接收地址
            helper.setSubject("一封带静态资源的邮件"); // 标题
            helper.setText("<html><body>博客图：<img src='cid:img'/></body></html>", true); // 内容
            // 传入附件
            helper.addInline("img", ResourceUtils.getFile("classpath:static/009.jpg"));
            jms.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @Autowired
    private TemplateEngine templateEngine;

    @RequestMapping("sendTemplateEmail")
    public String sendTemplateEmail(String code) {
        MimeMessage message = null;
        try {
            message = jms.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo("wno704@qq.com"); // 接收地址
            helper.setSubject("邮件摸板测试"); // 标题
            // 处理邮件模板
            Context context = new Context();
            context.setVariable("code", code);
            String template = templateEngine.process("emailTemplate", context);
            helper.setText(template, true);
            jms.send(message);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/TextMail")
    public String sendTextMail(){
        try {
            MailDO mail = new MailDO();
            mail.setTitle("一封简单的邮件");
            mail.setContent("测试一封简单的邮件");
            mail.setEmail("wno704@qq.com");
            mailService.sendTextMail(mail);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/htmlMail")
    public String sendHtmlMail(){
        try {
            MailDO mail = new MailDO();
            mail.setTitle("一封简单的HTML邮件");
            mail.setContent("<p style='color:#6db33f'>使用Spring Boot发送HTML格式邮件。</p>");
            mail.setEmail("wno704@qq.com");
            mailService.sendHtmlMail(mail,true);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/InlineMail")
    public String sendInlineMail(){
        try {
            MailDO mail = new MailDO();
            mail.setTitle("一封简单的Inline邮件");
            mail.setContent("<html><body>博客图：<img src='cid:img'/></body></html>");
            mail.setEmail("wno704@qq.com");
            Map<String,Object> map = new HashMap<>();
            map.put("img","classpath:static/009.jpg");
            mail.setAttachment(map);
            mailService.sendHtmlMail(mail,true);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/AttachMail")
    public String sendAttachMail(){
        try {
            MailDO mail = new MailDO();
            mail.setTitle("一封简单的附件邮件");
            mail.setContent("附件测试，具体见附件内容：");
            mail.setEmail("wno704@qq.com");
            Map<String,Object> map = new HashMap<>();
            map.put("计算机词汇.scel","classpath:static/计算机词汇.scel");
            mail.setAttachment(map);
            mailService.sendAttachMail(mail);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @GetMapping("/TemplateMail")
    public String sendTemplateMail(String code){
        try {
            MailDO mail = new MailDO();
            mail.setTitle("一封简单的模板邮件");
            mail.setEmail("wno704@qq.com");
            Map<String,Object> map = new HashMap<>();
            map.put("code",code);
            mail.setAttachment(map);
            mailService.sendTemplateMail(mail);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
