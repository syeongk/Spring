package org.spring.config;

import org.spring.domain.Person;
import org.spring.domain.Rabbit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.spring.domain")
public class ProjectConfig {

    @Bean
    Rabbit rabbit1(){
        Rabbit r = new Rabbit();
        r.setName("토순1");
        return r;
    }

    @Bean(name="r2")
    Rabbit rabbit2(){
        Rabbit r = new Rabbit();
        r.setName("토순2");
        return r;
    }

    @Bean
    Person person1(){
        Person p = new Person();
        p.setName("김서영");
        p.setRabbit(rabbit1());
        return p;
    }

    //Rabbit 타입의 빈이 2개 이상 있음 @Qualifier
    @Bean
    Person person2(@Qualifier("r2") Rabbit rabbit){
        Person p = new Person();
        p.setName("김소영");
        p.setRabbit(rabbit);
        return p;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
