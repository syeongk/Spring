package org.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "김서영";

    private final Rabbit rabbit;

    @Autowired
    public Person(@Qualifier("rabbit2") Rabbit rabbit){
        this.rabbit = rabbit;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Rabbit getRabbit(){
        return rabbit;
    }

}
