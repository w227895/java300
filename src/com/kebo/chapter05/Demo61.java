package com.kebo.chapter05;

/**
 * @description: 成员变量的默认初始化值
 * @Author: kb
 * @Date: 2020-08-04 20:21
 */
public class Demo61 {
    private byte b;
    private short s;
    private long l;
    private int i;
    private float f;
    private double d;
    private boolean flag;
    private char c;
    private String string;
    public static void main(String[] args) {
        Demo61 d=new Demo61();
        System.out.println(d.b);
        System.out.println(d.s);
        System.out.println(d.l);
        System.out.println(d.i);
        System.out.println(d.f);
        System.out.println(d.d);
        System.out.println(d.flag);
        System.out.println(d.c);
        System.out.println(d.string);
    }
}
