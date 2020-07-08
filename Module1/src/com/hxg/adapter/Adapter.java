package com.hxg.adapter;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 16:00
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("This is the Targeble method2....");
    }
}
