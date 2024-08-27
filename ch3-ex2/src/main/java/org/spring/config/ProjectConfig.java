package org.spring.config;

import org.spring.domain.Person;
import org.spring.domain.Rabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Rabbit rabbit(){
        Rabbit rabbit = new Rabbit();
        rabbit.setName("토순");
        return rabbit;
    }

    // 와이어링 : 빈을 반환하는 메서드를 직접 호출
    @Bean
    Person person(){
        Person person = new Person();
        person.setName("김서영");
        person.setRabbit(rabbit());
        return person;
    }
}
