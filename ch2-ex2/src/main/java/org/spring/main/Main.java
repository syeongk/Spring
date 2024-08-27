package org.spring.main;

import org.spring.Rabbit;
import org.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // 종류가 같은 빈이 여러 개일 때 : Bean 이름 / Bean 메서드 이름 / @Primary
        Rabbit r;

        r = context.getBean("토순", Rabbit.class);
        System.out.println(r.getName());

        r = context.getBean("rabbit2", Rabbit.class);
        System.out.println(r.getName());

        r = context.getBean(Rabbit.class);
        System.out.println(r.getName());


    }
}