package com.hxg.pojo;

/**
 * @author HeXiangGuang
 * @create 2020-07-02 9:26
 */
public class Test {
    public static void main(String[] args) {

        int [] maxshort ={5,1,6,3,2,9};
        BubbleSort1(maxshort);
        for (int i = 0; i < maxshort.length; i++) {
            int i1 = maxshort[i];
            System.out.println("排序"+i1);

        }
        System.out.println();
    }
    /**顺序扫描给定数据，将无序数列中的最大元素依次排到最后。即先冒出最大的气泡*/
    public static int[] BubbleSort1(int[] array){
        int t = 1;
        for(int i = 0 ; i < array.length - 1 ; i++){
            for(int j = 0; j < array.length - 1 - i ; j++){
                if(array[j] > array[j+1]){
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
//			for (int a : array) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
        }
        return array;
    }
}
