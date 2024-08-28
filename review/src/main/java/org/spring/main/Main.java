package org.spring.main;

import org.spring.config.ProjectConfig;
import org.spring.domain.Parrot;
import org.spring.domain.Rabbit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //1
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Rabbit rabbit = new Rabbit();

        //2
        Rabbit r = context.getBean(Rabbit.class);
        System.out.println(r.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer ten = context.getBean(Integer.class);
        System.out.println(ten);

        //3
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

    }
}