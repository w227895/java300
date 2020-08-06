package com.kebo.chapter05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description: 查看类的成员变量
 * @author: kb
 * @create: 2020-08-04 21:31
 **/
public class Demo63 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz=Class.forName("java.util.ArrayList");
        System.out.println(clazz.getCanonicalName());
        Constructor<?>[] constructors=clazz.getConstructors();
        System.out.println("类的构造方法：");
        if(constructors.length!=0){
            for (Constructor c:constructors) {
                System.out.println("\t"+c);
            }
        }else {
            System.out.println("空");
        }
        Field[] fields=clazz.getDeclaredFields();
        System.out.println("类的非继承变量：");
        if(fields.length!=0){
            for (Field f:fields) {
                System.out.println("\t"+f);
            }
        }else {
            System.out.println("空");
        }
        Method[]methods=clazz.getMethods();
        System.out.println("类的非继承方法：");
        if(methods.length!=0){
            for (Method method:methods) {
                System.out.println("\t"+method);
            }
        }else {
            System.out.println("空");
        }
    }
}

