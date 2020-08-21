package com.wno704.boot.service;

import com.wno704.boot.model.MailDO;

public interface MailService {
    void sendTextMail(MailDO mail);

    void sendHtmlMail(MailDO mail,boolean isShowHtml);

    void sendAttachMail(MailDO mail);

    void sendTemplateMail(MailDO mail);
}
