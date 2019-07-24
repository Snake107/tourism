package com.ssm.email;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

/**
 * @version 1.0.0
 * @auther Snake
 * @date 2019/7/1 19:57
 */
public class EmailConfig {
    // 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
    @Value("${QQMail.myEmailAccount}")
    private  String myEmailAccount ;
    @Value("${QQMail.myEmailPassword}")
    private  String myEmailPassword ;//这个密码不是QQ密码或者邮箱密码，要验证的。自己百度

    // 发件人邮箱的 SMTP 服务器地址, 必须准确, 不同邮件服务器地址不同, 一般格式为: smtp.xxx.com
    // qq邮箱的 SMTP 服务器地址为: smtp.qq.com
    @Value("${QQMail.myEmailSMTPHost}")
    private  String myEmailSMTPHost ;

    @PostConstruct
    public void init(){
        //SendQQMailUtil.setConfig(myEmailAccount,myEmailPassword,myEmailSMTPHost);
    }
}
