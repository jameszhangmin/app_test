package com.airwalker.javacore.alitest;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class SortArray {
    public static void reOrderArray(int [] array) {
        int temp0;
        for (int i = 0, j=0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                swap(array, i, j);
                j++;
            }
        }
        for (int m:array){
            System.out.println(""+m);
        }
    }
    public static void swap(int[] v, int i, int j) {
        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }


    public static void main(String[] args) {
        int[] arr = {3,14,89,65,789,4,5,65,876};
        reOrderArray(arr);

        System.out.println(10 << 3);
    }
}
