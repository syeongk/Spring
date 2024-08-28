package org.spring.main;

import org.spring.config.ProjectConfig;
import org.spring.domain.Parrot;
import org.spring.domain.Person;
import org.spring.domain.Rabbit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //1

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person1 = context.getBean("person1", Person.class);
        System.out.println((person1.getRabbit()).getName());

        Person person2 = context.getBean("person2", Person.class);
        System.out.println((person2.getRabbit()).getName());
    }
}