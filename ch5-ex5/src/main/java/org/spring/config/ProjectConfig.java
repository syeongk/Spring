package org.spring.config;

import org.spring.services.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.xml.stream.events.Comment;

@Configuration
@ComponentScan(basePackages = {"org.spring.services"})
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    CommentService commentService() {
        return new CommentService();
    }

}
