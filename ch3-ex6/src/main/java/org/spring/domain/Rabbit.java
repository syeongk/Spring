package org.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class Rabbit {

    private String name = "토순";

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
