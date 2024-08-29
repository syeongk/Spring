package org.spring;

import org.spring.config.ProjectConfig;
import org.spring.services.CommentService;
import org.spring.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        UserService userService = context.getBean(UserService.class);

        boolean b
                = commentService.getCommentRepository() == userService.getCommentRepository();
        System.out.println(b);
    }
}