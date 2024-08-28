# 2 - 스프링 컨텍스트에 빈을 추가하기
### @Bean
스프링 컨텍스트 생성 시 @Bean 메서드 호출, 반환 값을 컨텍스트에 추가
- [스프링 컨텍스트 및 인스턴스 생성](https://github.com/syeongk/Spring/tree/main/ch2-ex1/src/main/java/org/spring)
- [스프링 컨텍스트에 여러 개의 빈 주입](https://github.com/syeongk/Spring/tree/main/ch2-ex1/src/main/java/org/spring)
- [스프링 컨텍스트에 같은 종류의 빈 주입](https://github.com/syeongk/Spring/tree/main/ch2-ex2/src/main/java/org/spring)
  - Bean 이름
  - Bean 메소드 이름
  - @Primary

### @Component
해당 클래스의 인스턴스 생성, 컨텍스트에 추가
- [@Component 빈 주입](https://github.com/syeongk/Spring/tree/main/ch2-ex3/src/main/java/org/spring) <br>
  - @ComponentScan(basePackages = " ")
  - @PostConstruct

  
# 3 - 빈 간 관계 구현하기
### 와이어링
- [빈을 반환하는 메서드를 직접 호출](https://github.com/syeongk/Spring/tree/main/ch3-ex2/src/main/java/org/spring)
- [@Bean 메서드의 매개변수에 빈 호출](https://github.com/syeongk/Spring/tree/main/ch3-ex3/src/main/java/org/spring)


### @Autowired
