package org.spring.repositories;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository {

    public CommentRepository(){
        System.out.println("CommentRepository instance created!");
    }
}
