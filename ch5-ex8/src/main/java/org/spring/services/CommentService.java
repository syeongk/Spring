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
    private final CommentProcess commentProcess;

    @Autowired
    public CommentService(CommentRepository commentRepository, CommentProcess commentProcess) {
        this.commentRepository = commentRepository;
        this.commentProcess = commentProcess;
    }

    public void sendComment(Comment comment) {

        commentProcess.setComment(comment);
        commentProcess.processComment();

        commentRepository.storeComment(comment);
    }
}
