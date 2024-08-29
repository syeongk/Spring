package org.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Component
public class CommentProcess {

    private Comment comment;
    private final CommentRepository commentRepository;

    public CommentProcess(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment(Comment comment) {

        comment.setContent(comment.getContent() + " -> 처리");
    }
}
