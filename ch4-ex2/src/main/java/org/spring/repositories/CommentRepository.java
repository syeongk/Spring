package org.spring.repositories;

import org.spring.models.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
