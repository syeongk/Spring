package org.spring.config;

import org.spring.domain.Person;
import org.spring.domain.Rabbit;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Rabbit rabbit1(){
        Rabbit rabbit = new Rabbit();
        rabbit.setName("토순1");
        return rabbit;
    }

    @Bean
    public Rabbit rabbit2(){
        Rabbit rabbit = new Rabbit();
        rabbit.setName("토순2");
        return rabbit;
    }

    // 와이어링 : 빈을 반환하는 메서드를 직접 호출
    @Bean
    public Person person(@Qualifier("rabbit2") Rabbit rabbit){
        Person person = new Person();
        person.setName("김서영");
        person.setRabbit(rabbit);
        return person;
    }
}
