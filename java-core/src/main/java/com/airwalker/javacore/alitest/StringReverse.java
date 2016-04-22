package com.airwalker.javacore.alitest;

import java.util.StringTokenizer;

/**
 * @author: Zhang.Min
 * @since: 2016/4/20
 * @version: 1.7
 */
public class StringReverse {
    public void convert1(String s){
        String[] str = s.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i= str.length-1;i>=0;i--){
            sb.append(str[i] + " ");
        }
        System.out.println (sb.toString());
    }

    public void convert2(String s){
        StringTokenizer st = new StringTokenizer(s);
        String reverseStr = " ";
        while (st.hasMoreTokens()) {
            reverseStr = st.nextToken() + " " + reverseStr;
        }
        System.out.println (reverseStr);
    }

    public void convert3(String s){
        StringBuffer sb = new StringBuffer(s);
        System.out.println (sb.reverse().toString());

    }

    public static void main(String[] args){
        String s = "I am a student.";
        StringReverse st = new StringReverse();
        System.out.println ("发转前的字符串是：");
        System.out.println (s);
        System.out.println ("发转后的字符串是：");
        st.convert1(s);
        st.convert2(s);
        st.convert3(s);
    }
}
