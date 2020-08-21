package com.wno704.boot.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class MailDO {
    //标题
    private String title;
    //内容
    private String content;
    //接收人邮件地址
    private String email;
    //附加，value 文件的绝对地址/动态模板数据
    private Map<String, Object> attachment;
}
