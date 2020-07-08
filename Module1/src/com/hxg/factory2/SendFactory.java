package com.hxg.factory2;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 14:18
 */
public class SendFactory {
    //创建一个方法ProduceMail该方法用于创建MailSender对象
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
