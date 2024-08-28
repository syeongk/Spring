package org.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "김서영";

    @Autowired
    private Rabbit rabbit;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setRabbit(Rabbit rabbit){
        this.rabbit = rabbit;
    }

    public Rabbit getRabbit(){
        return rabbit;
    }

}
