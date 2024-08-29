package org.spring.proxies;

import org.spring.models.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment to email : " + comment.getText());
    }
}
