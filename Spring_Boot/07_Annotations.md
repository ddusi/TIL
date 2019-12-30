#  Annotations

>  어노테이션이란? 
>
> @를 사용한 주석으로 자바코드에 주석을 달아 특별한 의미를 부여한 것. 어노테이션은 개발자를 위한것이 아니라 컴퓨터를 위한 주석 정도로 이해하면 좋다.
>
> 컴파일러가 특정오류를 억제하도록 지시하는 것과 같이 프로그램 코드의 일부가 아닌 프로그램에 관한 데이터를 제공.  코드에 정보를 추가하는 정형화된 방법.



###  1. 기본 어노테이션 ( JDK )

#### 	1. @Override 

해당 메소드가 부모 클래스에 있는 매소드를 덮어씌어 재정의했다는 것



#### 	2. @Deprecated 

더이상 사용되지 않는 클래스나 메소드 앞에 추가



####	3. @SuppressWarings 

프로그램에는 문제가 없는데 간혹 컴파일러가 경고를 뿜을 때가 있는데, 이를 무시하라고 프로그래머에게 알려줌.





### 2. 메타 어노테이션

어노테이션을 선언 할 때 사용. 프로그래머가 어노테이션을 만들 때, 사용하는 것.



#### 1.  @Target

  어노테이션이 적용할 위치를 결정

> improt.java.lang.annotation.Target;



- 적용 가능 대상들 

  ```
  import java.lang.annotation.ElementType;
  ElmentType.TYPE : 클래스, 인터페이스, 열거 타입
  ElmentType.ANNOTATION_TYPE : 어노테이션 타입
  ElmentType.FIELD : 필드
  ElmentType.CONSTRUCTOR : 생성자
  ElmentType.METHOD : 메서드
  ElmentType.PARAMETER : 파라미터
  ElmentType.LOCAL_VARIABLE : 로컬 변수
  ElmentType.PACKAGE : 패키지
  ```

  



#### 2. @ Retention

 어떤 시점까지 어노테이션이 영향을 미치는 결정

 import.java.lang.annotation.Retention;

```
<적용 가능 시점>
import java.lang.annotation.RetentionPolicy;
RetentionPolicy.SOURCE: 어노테이션 정보가 컴파일 시 사라짐
RetentionPolicy.CLASS: 클래스 파일에 있는 어노테이션정보가 컴파일러에 의해 참조 가능, 가상머신에서는 사라짐(리플렉션 불가, 디폴트)
RetentionPolicy.RUNTIME: 실행 시 어노테이션 정보가 가상머신에 의해서 참조 가능
```





#### 3. 사용자어노테이션 선언법

```java
public @interface 어노테이션이름

{
  // 엘리먼트들
  /*
  String value();
  String[] author();
  int revision() default 0; //엘리먼트에 디폴트값 주는법
  */
}
```

어노테이션은 암묵적으로 어노테이션 인터페이스를 상속받으므로, 상속받을수 없다.



#### 4. 어노테이션 사용

```
@어노테이션(엘리먼트=값, 엘리2=＂값＂)
public class 클래스
{}

@어노테이션2(값) //엘리먼트가 1개일 경우
Public class 클래스2
{}
```

메소드, 필드 등 어디에서나 사용할 수 있다.





### 3.  컨트롤러 관련 어노테이션 



#### @ Controller 

Spring에서  Controller  중 View 로 응답하지 않는 컨트롤러를 의미한다. 

이 어노테이션이 적혀있는 컨트롤러의 메서드는  HttpResponse 로 응답이 가능하다. 

@ResponseBody 역할을 자동적으로 해주는 어노테이션이다.



#### @RequestMapping

Spring 의 컨트롤러 혹은 그 메서드의  URI를 정의하는데 쓰인다.

요청을 받는 형식인 GET,POST,PUT,DELETE 를 정의하기도 한다.

정의하지 않는다면, 자동적으로  Get방식으로 설정된다.



#### @PathVariable 

URI에서 / 다음으로 넘어오는 값들을 파싱하는 어노테이션이다.



#### @RequestBody

POST나  PUT,PATCH로 요청을 받을때에, 요청에서 넘어온  body값들을 자바 타입으로 파싱해준다.



#### @RequestParam

?name=papago%value=20와 같은 쿼리 파라미터들을 파싱해준다. 

```java
@RequestMapping(value = "/search/movie", method = RequestMethod.GET)
public ResponseEntity<?> someMethod(@RequestParam String moviename) {
// request URI would be like '/search/movie?moviename=thepurge'
try {
   List<Movie> movies = service.searchByMoviename(moviename);
} catch(Exception e) {
   e.printStackTrace();
}
// return some response here
}
```



#### @ResponseBody

 HttpMessageConverter 이용하여  JSON혹은 XML로 요청에 응답할 수 있게 해주는 어노테이션이다. 이미 @RestCOntroller가 붙어있다면, 쓸 필요가 없다. 





### @Controller와 @RestController 차이

 @Controller와  @RestController의 차이는 크게 HTTP Response Body가 생성되는 방식이다.

 @Controller는 화면을 리턴하는 것이고, @RestController는 데이터를 리턴하는 것이다. 

 @Controller를 쓴다면 @Responsbody 어노테이션을 써서 JSON/XML형식으로 응답 할 수가 있다.

### `@RestController = @Controller + @ResponseBody`

<a swf='https://doublesprogramming.tistory.com/105'>설명 더보기</a>







### 4. 데이터 접근 관련 어노테이션

#### @Service

Service Class에서 쓰인다. 비즈니스 로직을 수행하는 클래스라는 것을 나타내는 용도.



#### @Repositorty

DAO class에서 쓰인다. 데이터베이스에 접근하는 메서드를 가지고 있는 클래스에서 쓰인다고 볼수있다.







### 5. 그밖의 스프링 어노테이션들



#### @SpringBootApplication

`@SpringBootApplication` 은 다음의 3개의 어노테이션을 포함한다.

- **@Configuration** 은 클래스를 애플리케이션 컨텍스트의 Bean 정의 소스로 **태그** 합니다.
- **@EnableAutoConfiguration** 은 스프링 부트에게 클래스 패스 설정, 다른 빈, 다양한 속성 설정을 기반으로 빈 추가를 시작 **하도록** 지시합니다. 기술적으로 Spring Boot는 스케줄링과 관련하여 자동 구성 할 것이 없지만 향후 버전이 될 수 있습니다.
- **@ComponentScan** 은 Spring에게 다른 컴포넌트, 구성 및 서비스를 찾도록 지시합니다.









