package org.spring.main;

import org.spring.config.ProjectConfig;
import org.spring.config.SampleConfig;
import org.spring.domain.Parrot;
import org.spring.domain.Person;
import org.spring.domain.Rabbit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //1

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1.getRabbit());

        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2.getRabbit());

        var context2 = new AnnotationConfigApplicationContext(SampleConfig.class);
        Person person4 = context2.getBean(Person.class);
        System.out.println(person4.getParrot());
    }
}