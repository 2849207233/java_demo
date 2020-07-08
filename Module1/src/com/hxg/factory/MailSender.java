package com.hxg.factory;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 9:23
 */
public class MailSender implements Sender{
    @Override
    public void Send() {
        System.out.println("This is mail sender....");
    }
}
