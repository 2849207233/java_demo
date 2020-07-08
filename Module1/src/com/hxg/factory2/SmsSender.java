package com.hxg.factory2;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 14:16
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is Sms Sender.....");
    }
}
