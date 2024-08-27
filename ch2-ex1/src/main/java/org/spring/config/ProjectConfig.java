package org.spring.config;

import org.spring.Rabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 구성 클래스 정의
@Configuration
public class ProjectConfig {

    @Bean
    Rabbit rabbit(){
        Rabbit theRabbit = new Rabbit();
        theRabbit.setName("토순");
        return theRabbit;
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
