package org.spring;

import org.spring.config.ProjectConfig;
import org.spring.models.Comment;
import org.spring.proxies.CommentNotificationProxy;
import org.spring.proxies.EmailCommentNotificationProxy;
import org.spring.repositories.CommentRepository;
import org.spring.repositories.DBCommentRepository;
import org.spring.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("John Doe");
        comment.setText("Hello World!");

        commentService.publishComment(comment);

    }
}