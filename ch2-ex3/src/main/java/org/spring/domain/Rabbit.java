package org.spring.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Rabbit {

    private String name;

    @PostConstruct
    public void init(){
        this.name = "토순";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
