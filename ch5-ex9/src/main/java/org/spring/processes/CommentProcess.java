package org.spring.processes;

import org.spring.models.Comment;
import org.spring.repositories.CommentRepository;
import org.springframework.stereotype.Component;

@Component
public class CommentProcess {

    private Comment comment;
    private final CommentRepository commentRepository;

    public CommentProcess(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public synchronized void setComment(Comment comment) {
        this.comment = comment;
    }

    public synchronized Comment getComment() {
        return comment;
    }

    public synchronized void processComment() {
        if (comment != null) {
            comment.setContent(comment.getContent() + " -> 처리");
        }
    }
}
