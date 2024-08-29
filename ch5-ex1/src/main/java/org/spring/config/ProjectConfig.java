package org.spring.config;

import org.spring.service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    CommentService commentService(){
        return new CommentService();

    }

}
