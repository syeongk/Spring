package org.spring.domain;

public class Rabbit {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Rabbit : " + name;
    }
}
