package org.spring.main;

import org.spring.config.ProjectConfig;
import org.spring.domain.Rabbit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Rabbit r = context.getBean(Rabbit.class);

        System.out.println(r);
        System.out.println(r.getName());

    }
}