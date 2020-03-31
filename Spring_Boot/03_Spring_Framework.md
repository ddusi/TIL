# 스프링 프레임워크 Spring Framework 

> [자바 플랫폼](https://ko.wikipedia.org/wiki/자바_(소프트웨어_플랫폼))을 위한 [오픈 소스](https://ko.wikipedia.org/wiki/오픈_소스) 경량급 [애플리케이션 프레임워크](https://ko.wikipedia.org/wiki/애플리케이션_프레임워크)로서 간단히 **스프링**(Spring)이라고도 한다. 동적인 웹 사이트를 개발하기 위한 여러 가지 서비스를 제공하고 있다.

#### - 스프링의 목적

'경량급 프레임워크인 스프링을 활용해서 엔터프라이즈 애플리케이션 개발을 편하게' 하는 것입니다.

> 더 자세한 정보 : https://12bme.tistory.com/157



### 1. @RestController의 동작방식

@RestController 는 @Controller 어노테이션과 @ResponseBody 어노테이션을 합쳐놓은 어노테이션이다. 클래스 상단에 @RestController 어노테이션을 선언하면 Method마다 @ResponseBody를 붙여 주지 않아도 된다.

```java
@RestController = @Controller + @ResponseBody
```



#### @RestController

```java
@RestController 
public class HomeController{
    @Autowired
    MemberService mservice;
    
    @RequestMapping(value="/register")
    public list<MemberV0> register() throws Exception {
    
        return mservice.selectMember();
    }
}
```

#### @Controller + @ResponseBody

```java
@Controller 
public class HomeController{
    @Autowired
    MemberService mservice;
    
    @RequestMapping(value="/register")
    public @ResponseBody List<MemberV0> register() throws 			Exception {
    
    return mservice.selectMember();
    }
}
```

#### Result

```
둘다 동일하게 작동한다고 볼 수 있다.
```



### 2. @Controller와 @RestController 차이

------

### @Controller(Spring MVC Controller)

### **[ Controller - View ]**

전통적인 Spring MVC의 컨트롤러인 @Controller는 주로 View를 반환하기 위해 사용합니다. 아래와 같은 과정을 통해 Spring MVC Container는 Client의 요청으로부터 View를 반환합니다.

 



![img](https://k.kakaocdn.net/dn/2BnED/btqybg36Dak/3HgL3gUKHBSOmyeM4hIn00/img.png)



1. Client는 URI 형식으로 웹 서비스에 요청을 보낸다.
2. Mapping되는 Handler와 그 Type을 찾는 DispatcherServlet이 요청을 인터셉트한다.
3. Controller가 요청을 처리한 후에 응답을 DispatcherServlet으로 반환하고, DispatcherServlet은 View를 사용자에게 반환한다.



### **[ Controller - Data ]**

하지만 Spring MVC의 컨트롤러에서도 Data를 반환해야 하는 경우도 있습니다. Spring MVC의 컨트롤러에서는 데이터를 반환하기 위해 @ResponseBody 어노테이션을 활용해주어야 합니다. 이를 통해 Controller도 Json 형태로 데이터를 반환할 수 있습니다.

 



![img](https://k.kakaocdn.net/dn/bEJ1YG/btqx8Tvu8qa/lkDg8cu2G4xMi8Pg22C1f0/img.png)



1. Client는 URI 형식으로 웹 서비스에 요청을 보낸다.
2. Mapping되는 Handler와 그 Type을 찾는 DispatcherServlet이 요청을 인터셉트한다.
3. @ResponseBody를 사용하여 Client에게 Json 형태로 데이터를 반환한다.



### @RestController(Spring Restful Controller)

### **[ RestController ]**

@RestController는 Spring MVC Controlle에 @ResponseBody가 추가된 것입니다. 당연하게도 RestController의 주용도는 Json/Xml 형태로 객체 데이터를 반환하는 것입니다. 개인적으로는 VueJS + Spring boot 프로젝트를 진행할 때 Spring boot를 API 서버로 활용할 때 그리고 Android 앱 개발을 하면서 데이터를 반환할 때 사용하였습니다.

 



![img](https://k.kakaocdn.net/dn/7bceC/btqx8K6BbxE/LVs4KK74mUj9CZ70uHTsjK/img.png)



1. Client는 URI 형식으로 웹 서비스에 요청을 보낸다.
2. Mapping되는 Handler와 그 Type을 찾는 DispatcherServlet이 요청을 인터셉트한다.
3. RestController는 해당 요청을 처리하고 데이터를 반환한다.