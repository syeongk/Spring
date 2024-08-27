package org.spring.domain;

public class Person {

    private String name;
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
