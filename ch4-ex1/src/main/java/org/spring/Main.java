package org.spring;

import org.spring.models.Comment;
import org.spring.proxies.CommentNotificationProxy;
import org.spring.proxies.EmailCommentNotificationProxy;
import org.spring.repositories.CommentRepository;
import org.spring.repositories.DBCommentRepository;
import org.spring.services.CommentService;

public class Main {
    public static void main(String[] args) {

        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("John Doe");
        comment.setText("Hello World!");

        commentService.publishComment(comment);

    }
}