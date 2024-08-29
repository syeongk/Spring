package org.spring;

import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {

    public CommentRepository(){
        System.out.println("CommentRepository instance created!");
    }

    public void storeComment(Comment comment){
        System.out.println("CommentRepository stored : " + comment.getContent());
    }
}
