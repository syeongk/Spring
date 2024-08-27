package org.spring.main;

import org.spring.Rabbit;
import org.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 스프링 컨텍스트에 새로운 빈 추가
public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Rabbit r = context.getBean(Rabbit.class);
        String s = context.getBean(String.class);
        Integer i = context.getBean(Integer.class);

        System.out.println(r.getName());
        System.out.println(r);
        System.out.println(s);
        System.out.println(i);
    }
}