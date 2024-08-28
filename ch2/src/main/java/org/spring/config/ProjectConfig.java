package org.spring.config;

import org.spring.Rabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Rabbit rabbit(){
        Rabbit r = new Rabbit();
        r.setName("토순");
        return r;
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
