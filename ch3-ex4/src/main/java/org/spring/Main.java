package org.spring;

import org.spring.config.ProjectConfig;
import org.spring.domain.Person;
import org.spring.domain.Rabbit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        Rabbit r = context.getBean(Rabbit.class);

        System.out.println(p.getName());
        System.out.println(p.getRabbit());
    }
}