package org.spring.services;

import org.spring.models.Comment;
import org.spring.processes.CommentProcess;
import org.spring.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    private ApplicationContext context;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void sendComment(Comment comment) {
        CommentProcess commentProcess = context.getBean(CommentProcess.class);
        commentProcess.setComment(comment);
        commentProcess.processComment();

        commentRepository.storeComment(comment);
    }
}
