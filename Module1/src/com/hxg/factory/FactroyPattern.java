package com.hxg.factory;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 9:27
 */
public class FactroyPattern {
    public static void main(String[] args) {
        //调用produce方法传入mail,然后produce会根据equals方法进行判断创建对应工厂模式
        Sender sender = produce("mail");
        sender.Send();
    }
    //工厂的生产方法
    private static Sender produce(String str) {
        //如果传入的值是mail，则创建MailSender工厂
        if ("mail".equals(str)){
            return new MailSender();
        }else if ("sms".equals(str)){//如果传入的值是sms，则创建SmsSender工厂
            return new SmsSender();
        }else {
            System.out.println("输入错误。。。。。。。。。。");
            return null;
        }
    }
}
