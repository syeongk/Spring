package org.spring.config;

import org.spring.domain.Rabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.spring.domain")
public class ProjectConfig {

    @Primary
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
    String hello(){
        return "hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
