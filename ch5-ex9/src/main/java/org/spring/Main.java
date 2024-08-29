package org.spring;

import org.spring.config.ProjectConfig;
import org.spring.models.Comment;
import org.spring.processes.CommentProcess;
import org.spring.repositories.CommentRepository;
import org.spring.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        System.out.println("CommentService instance created!");

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; i++) {
            final int index = i;
            executorService.submit(() -> {
                Comment comment = new Comment();
                comment.setAuthor("author" + index);
                comment.setContent("content" + index);
                commentService.sendComment(comment);
                System.out.println(comment);
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
