package com.clg.config.annotation;

import java.lang.reflect.Method;

/**
 * @Author cailiugen
 * @Date 2019/11/22
 */
public class TestAnnoatation {
    @MethodAnnotation(name = "abc", score = 123)
    public void study(int times) {
    }

    public static void main(String[] args) {
        try {
            //获取TestAnnoatation的Class对象
            Class testClass = Class.forName("com.clg.config.annotation.TestAnnoatation");

            Method stuMethod = testClass.getMethod("study", int.class);

            if (stuMethod.isAnnotationPresent(MethodAnnotation.class)) {
                System.out.println("study方法上配置了MethodAnnotation注解！");
                //获取该元素上指定类型的注解
                MethodAnnotation methodAnnotation = stuMethod.getAnnotation(MethodAnnotation.class);
                System.out.println("name: " + methodAnnotation.name() + ", age: " + methodAnnotation.age()
                        + ", score: " + methodAnnotation.score()[0]);
            } else {
                System.out.println("Student类上没有配置MethodAnnotation注解！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
