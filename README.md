# Overview
Spring에 관한 기초적인 내용 정리 <br>
1. 스프링 컨텍스트와 빈 주입
2. 의존성 주입
3. 추상화 : 구현 분리
   
## 1 - 스프링 컨텍스트에 빈 추가하기
객체가 의존성이 있거나 그 자체로 의존성인 경우 스프링 컨텍스트에 추가해야 한다.

### @Bean
빈 : 스프링에서 관리하는 인스턴스 <br>
스프링 컨텍스트 생성 시 @Bean 메서드 호출, 반환 값을 컨텍스트에 추가
- [스프링 컨텍스트 및 인스턴스 생성](https://github.com/syeongk/Spring/tree/main/ch2-ex1/src/main/java/org/spring)
- [스프링 컨텍스트에 여러 개의 빈 주입](https://github.com/syeongk/Spring/tree/main/ch2-ex1/src/main/java/org/spring)
- [스프링 컨텍스트에 같은 종류의 빈 주입](https://github.com/syeongk/Spring/tree/main/ch2-ex2/src/main/java/org/spring)
  - Bean 이름
  - Bean 메소드 이름
  - @Primary

### @Component
stereotype annotation : 스프링이 인스턴스를 생성하고 컨텍스트에 추가하는 데 필요한 클래스에 사용
- [@Component 빈 주입](https://github.com/syeongk/Spring/tree/main/ch2-ex3/src/main/java/org/spring) <br>
  - @ComponentScan(basePackages = " ")
  - @PostConstruct

  
## 2 - 의존성 주입 : 빈 간 관계 구현하기
의존성 : A 빈이 B 빈을 사용한다면 A 빈이 B 빈에 의존성을 갖는 것 <br>
순환 의존성 : A 빈이 B 빈을 의존하고 B 빈이 A 빈을 의존하는 경우 빈 생성에 있어 문제가 발생한다.

### 와이어링 : 구성 파일에서 의존성 주입
- [빈을 반환하는 메서드를 직접 호출](https://github.com/syeongk/Spring/tree/main/ch3-ex2/src/main/java/org/spring)
- [@Bean 메서드의 매개변수에 빈 호출](https://github.com/syeongk/Spring/tree/main/ch3-ex3/src/main/java/org/spring)

### 오토와이어링 : @Autowired 의존성 주입
- [클래스 필드로 의존성 주입](https://github.com/syeongk/Spring/blob/main/ch3-ex4/src/main/java/org/spring/domain/Person.java)
- [생성자로 의존성 주입](https://github.com/syeongk/Spring/blob/main/ch3-ex5/src/main/java/org/spring/domain/Person.java)
- [setter로 의존성 주입](https://github.com/syeongk/Spring/blob/main/ch3-ex6/src/main/java/org/spring/domain/Person.java)

### 동일 타입 빈이 여러 개일 때, @Qualifier로 어떤 빈을 주입할지 알리기
- [구성 파일에서](https://github.com/syeongk/Spring/blob/main/ch3-ex3/src/main/java/org/spring/config/ProjectConfig.java)
- [생성자 매개변수에서](https://github.com/syeongk/Spring/blob/main/ch3-ex7/src/main/java/org/spring/domain/Person.java)

## 3 - 추상화 : 인터페이스 for 구현 분리
service : 사용 사례 구현하는 객체 <br>
repository : 데이터베이스와 직접 작업하는 객체 <br>
proxy : 앱 외부와 통신을 담당하는 객체 <br>
model : 앱이 사용하는 데이터를 모델링하는 객체 (POJO : 의존성이 없는 단순 객체) <br>

### 인터페이스
- 구현 간 결합
![2023  12  5  - 198](https://github.com/user-attachments/assets/922efd51-4d02-4310-b71a-b62cd6918619)

- [구현 간 분리](https://github.com/syeongk/Spring/tree/main/ch4-ex2/src/main/java/org/spring)
![2023  12  5  - 201](https://github.com/user-attachments/assets/9224fcdf-8561-47b8-8710-914cc041ffe0)

### 스테레오타입 애너테이션을 사용하지 않는 경우
- interface, abstract class : 인스턴스화 할 수 없기 때문. <br>
- model : 의존성이 없고 그 자체로 의존성이 아니기 때문.

### 인터페이스에 대한 여러 구현체 중 의존성 주입 선택
- @Primary
- @Qualifier
