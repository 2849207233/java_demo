package com.hxg.factory2;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 14:09
 * MailSender
 */
public class MailSender implements Sender{

    @Override
    public void Send() {
        System.out.println("this is mail sender......");
    }
}
