package org.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        System.out.println("CommentService instance created!");

        Comment comment1 = new Comment();
        comment1.setAuthor("김서영");
        comment1.setContent("안녕하세요");

        commentService.sendComment(comment1);

        System.out.println(comment1);

        Comment comment2 = new Comment();
        comment2.setAuthor("김서영");
        comment2.setContent("안녕하세요");

        commentService.sendComment(comment2);

        System.out.println(comment2);




    }
}