package com.hxg.java;


import com.hxg.pojo.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class Project_demo_java {

    //        2.6 prsf：可生成 private static final
    private static final Customer cust = new Customer();
    /*
    *
    *
    *
    *
    * */
//    注释
//    注释
    int sum = 100;

    public static void main(String[] args) {

        //fori快速提示出现下面代码
        //sout的变形soum打印当前方法souv打印最近的一个参数xxx。sout也是
        System.out.println("Hello World！！");
        //soutp快速提示出现下面代码，打印方法形參
        System.out.println("args = " + Arrays.deepToString(args));

        String[] arr =new String[]{"hello","time","jack","wucao"};
        
        //模板三：fori快速提示出现下面代码
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("itar"+s);

        }
        //Alt+Enter+new ArrayList()可以快速打印下面一行
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(666);
        //list.for快速提示出现下面代码
        for (Object o : list) {
            
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("这是list"+list);
            System.out.println("这是list6666   "+ list.get(i));
            System.out.println("这是iiiii"+i);
        }
        //变形：list.forr 倒序
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("这是倒序list"+list);
            System.out.println("这是倒序list6666   "+ list.get(i));
            System.out.println("这是倒序iiiii"+i);
        }
        metho();
    }
    //模板5
    private static void metho() {
        System.out.println("Project_demo_java.metho------");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(999);
        
        //模板5:ifn
        if (list == null) {
            
        }
        //模板5:ifnn
        if (list != null) {

        }
//        2.6 prsf：可生成 private static final

//        类似的：
//        psf：可生成 public static final
//        psfi：可生成 public static final int
//        psfs：可生成 public static final String
    }
}
