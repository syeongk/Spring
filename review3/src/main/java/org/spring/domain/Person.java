package org.spring.domain;

public class Person {

    private String name;
    private Rabbit rabbit;
    private Parrot parrot;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRabbit(Rabbit rabbit){
        this.rabbit = rabbit;
    }

    public Rabbit getRabbit(){
        return rabbit;
    }

    public void setParrot(Parrot parrot){
        this.parrot = parrot;
    }

    public Parrot getParrot(){
        return parrot;
    }
}
