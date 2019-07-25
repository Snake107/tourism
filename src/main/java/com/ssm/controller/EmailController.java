package com.ssm.controller;

import com.ssm.pojo.Contact;
import com.ssm.service.ContactsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.util.Properties;

@Controller
public class EmailController {

    @Resource
    ContactsService contactsService;

    @ResponseBody
    @RequestMapping(value = "email",method = RequestMethod.POST)
    public Object email(@RequestBody Contact contact) throws Exception {
        String email = contact.getEmail();
        String regex ="^[a-z_\\d]+(?:\\.[a-z_\\d]+)*@qq\\.com$";
        boolean matches = email.matches(regex);
        if (matches) {
            Properties properties = new Properties();
            properties.put("mail.transport.protocol", "smtp");// 连接协议
            properties.put("mail.smtp.host", "smtp.qq.com");// 主机名
            properties.put("mail.smtp.port", 465);// 端口号
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.ssl.enable", "true");// 设置是否使用ssl安全连接 ---一般都使用
            properties.put("mail.debug", "true");// 设置是否显示debug信息 true 会在控制台显示相关信息
            // 得到回话对象
            Session session = Session.getInstance(properties);
            // 获取邮件对象
            Message message = new MimeMessage(session);
            // 设置发件人邮箱地址
            message.setFrom(new InternetAddress("447672996@qq.com"));
            // 设置收件人邮箱地址
            //message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com")});//多个收件人
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));//一个收件人
            // 设置邮件标题
            message.setSubject("小毛驴旅游平台");
            // 设置邮件内容
            message.setText("感谢您的反馈！");
            // 得到邮差对象
            Transport transport = session.getTransport();
            // 连接自己的邮箱账户
            transport.connect("447672996@qq.com", "nwftkdcvlstocabb");// 密码为QQ邮箱开通的stmp服务后得到的客户端授权码
            // 发送邮件
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            //反馈插入数据库
            contactsService.addContact(contact);

            return true;
        } else {
            return false;
        }

    }
}
