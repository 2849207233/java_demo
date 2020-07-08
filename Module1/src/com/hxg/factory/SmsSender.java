package com.hxg.factory;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 9:26
 */
public class SmsSender implements Sender{
    @Override
    public void Send() {
        System.out.println("This is Sms Sender....");
    }
}
