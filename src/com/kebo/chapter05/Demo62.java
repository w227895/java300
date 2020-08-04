package com.kebo.chapter05;


import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @description:
 * @Author: kb
 * @Date: 2020-08-04 20:26
 */
public class Demo62 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz=Class.forName("java.util.ArrayList");
        System.out.println(clazz.getCanonicalName());
        System.out.println(Modifier.toString(clazz.getModifiers()));
        TypeVariable<?>[] typeVariables=clazz.getTypeParameters();
        if(typeVariables.length!=0){
            for (TypeVariable<?> ty:typeVariables) {
                System.out.println(ty+"\t");
            }
        }else {
            System.out.println("空");
        }
        Type[] interfaces=clazz.getInterfaces();
        System.out.println("类所实现的接口：");
        if(interfaces.length!=0){
            for (Type type:interfaces) {
                System.out.println("\t"+type);
            }
        }else {
            System.out.println("\t"+"空");
        }
        Type superClass=clazz.getGenericSuperclass();
        System.out.println("类的直接继承类：");
        if(superClass!=null){
            System.out.println(superClass);
        }else {
            System.out.println("空");
        }
        Annotation[] annotations=clazz.getAnnotations();
        System.out.println("类的注解：");
        if(annotations.length!=0){
            for (Annotation annotation:annotations) {
                System.out.println("\t"+annotation);
            }
        }else {
            System.out.println("空");
        }
    }
}
