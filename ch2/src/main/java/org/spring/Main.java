package org.spring;

import org.spring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 스프링 컨텍스트와 객체 인스턴스 생성하기
public class Main {
    public static void main(String[] args) {

        // 스프링 컨텍스트 인스턴스 생성
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Rabbit r = new Rabbit();
    }
}