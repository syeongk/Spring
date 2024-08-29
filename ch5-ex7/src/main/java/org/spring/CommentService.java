package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    private ApplicationContext context;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void sendComment(Comment comment) {
        CommentProcess p = context.getBean(CommentProcess.class);
        System.out.println("CommentProcess instance created!");

        p.setComment(comment);
        p.processComment(comment);

        commentRepository.storeComment(comment);
    }
}
