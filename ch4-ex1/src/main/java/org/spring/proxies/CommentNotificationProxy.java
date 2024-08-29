package org.spring.proxies;

import org.spring.models.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
