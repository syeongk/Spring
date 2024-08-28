package org.spring.config;

import org.spring.domain.Person;
import org.spring.domain.Rabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "org.spring.domain")
@Configuration
public class ProjectConfig {

    @Bean
    public Rabbit rabbit1() {
        Rabbit r = new Rabbit();
        r.setName("토순1");
        return r;
    }

    @Bean
    public Rabbit rabbit2() {
        Rabbit r = new Rabbit();
        r.setName("토순2");
        return r;
    }


}
