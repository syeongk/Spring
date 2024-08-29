package org.spring;

import org.spring.config.ProjectConfig;
import org.spring.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before");
        CommentService commentService = context.getBean(CommentService.class);
        System.out.println("After");
    }
}