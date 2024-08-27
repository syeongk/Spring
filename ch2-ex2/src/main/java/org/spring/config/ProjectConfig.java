package org.spring.config;

import org.spring.Rabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name="토순")
    Rabbit rabbit1(){
        var aRabbit = new Rabbit();
        aRabbit.setName("토끼1");
        return aRabbit;
    }

    @Bean
    Rabbit rabbit2(){
        var aRabbit = new Rabbit();
        aRabbit.setName("토끼2");
        return aRabbit;
    }

    @Primary
    @Bean
    Rabbit rabbit3(){
        var aRabbit = new Rabbit();
        aRabbit.setName("토끼3");
        return aRabbit;
    }
}
