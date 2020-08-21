package com.wno704.boot.service.impl;

import com.wno704.boot.model.MailDO;
import com.wno704.boot.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileNotFoundException;

@Slf4j
@Service
public class MailServiceImpl implements MailService {

    //template模板引擎
    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Async
    @Override
    public void sendTextMail(MailDO mail) {
        //建立邮件消息
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from); // 发送人的邮箱
        message.setSubject(mail.getTitle()); //标题
        message.setTo(mail.getEmail()); //发给谁  对方邮箱
        message.setText(mail.getContent()); //内容
        try {
            javaMailSender.send(message); //发送
        } catch (MailException e) {
            log.error("纯文本邮件发送失败->message:{}",e.getMessage());
        }

    }

    @Async
    @Override
    public void sendHtmlMail(MailDO mail, boolean isShowHtml) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            //是否发送的邮件是富文本（附件，图片，html等）
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
            messageHelper.setFrom(from);// 发送人的邮箱
            messageHelper.setTo(mail.getEmail());//发给谁  对方邮箱
            messageHelper.setSubject(mail.getTitle());//标题
            messageHelper.setText(mail.getContent(),isShowHtml);//false，显示原始html代码，无效果
            //判断是否有附加图片等
            if(mail.getAttachment() != null && mail.getAttachment().size() > 0){
                mail.getAttachment().entrySet().stream().forEach(entrySet -> {
                    try {
                        File file = ResourceUtils.getFile(String.valueOf(entrySet.getValue()));
                        if(file.exists()){
                            messageHelper.addInline(entrySet.getKey(),file);
                        }
                    } catch (FileNotFoundException e ) {
                        log.error("附件发送失败->message:{}",e.getMessage());
                    }catch (MessagingException e) {
                        log.error("附件发送失败->message:{}",e.getMessage());
                    }
                });
            }
            //发送
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            log.error("富文本邮件发送失败->message:{}",e.getMessage());
        }
    }

    @Async
    @Override
    public void sendAttachMail(MailDO mail) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            //是否发送的邮件是富文本（附件，图片，html等）
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
            messageHelper.setFrom(from);// 发送人的邮箱
            messageHelper.setTo(mail.getEmail());//发给谁  对方邮箱
            messageHelper.setSubject(mail.getTitle());//标题
            messageHelper.setText(mail.getContent());
            //判断是否有附加图片等
            if(mail.getAttachment() != null && mail.getAttachment().size() > 0){
                mail.getAttachment().entrySet().stream().forEach(entrySet -> {
                    try {
                        File file = ResourceUtils.getFile(String.valueOf(entrySet.getValue()));
                        if(file.exists()){
                            messageHelper.addAttachment(entrySet.getKey(), file);
                        }
                    } catch (FileNotFoundException e ) {
                        log.error("附件发送失败->message:{}",e.getMessage());
                    }catch (MessagingException e) {
                        log.error("附件发送失败->message:{}",e.getMessage());
                    }
                });
            }
            //发送
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            log.error("富文本邮件发送失败->message:{}",e.getMessage());
        }
    }

    @Async
    @Override
    public void sendTemplateMail(MailDO mail) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
            messageHelper.setFrom(from);// 发送人的邮箱
            messageHelper.setTo(mail.getEmail());//发给谁  对方邮箱
            messageHelper.setSubject(mail.getTitle()); //标题
            //使用模板thymeleaf
            //Context是导这个包import org.thymeleaf.context.Context;
            Context context = new Context();
            //定义模板数据
            context.setVariables(mail.getAttachment());
            //获取thymeleaf的html模板
            String emailContent = templateEngine.process("emailTemplate",context); //指定模板路径
            messageHelper.setText(emailContent,true);
            //发送邮件
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            log.error("模板邮件发送失败->message:{}",e.getMessage());
        }
    }
}
