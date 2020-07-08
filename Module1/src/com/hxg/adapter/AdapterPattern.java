package com.hxg.adapter;

/**
 * @author HeXiangGuang
 * @create 2020-07-07 16:02
 * 类的适配器模式
 */
public class AdapterPattern {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();
    }
}
