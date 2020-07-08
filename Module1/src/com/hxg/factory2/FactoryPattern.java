package com.hxg.factory2;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 14:24
 */
public class FactoryPattern {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        //因为MailSender实现了Sender接口的Send方法
        // 所以下面直接用sender对象去调用Send接口中Send方法的时候就会有MailSender里面重写过dendriticSend方法；
        //这种模式就是多个工厂的模式
        sender.Send();
    }
}
