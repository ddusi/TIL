## Django

- 2003년에 신문사에서 사용하기 위해 개발
- 파이썬으로 만들어진 무료 오픈소스 웹 에플리케이션 프레임워크
- 웹 에플리케이션을 만들 수있는 하나의 라이브러리로 봐도 무방.
- 프로그램이 주가 되어 하나의 틀을 가지고 있고 그때마다 개발자가 그때그때 맞춰주는 형태를 프레임워크라고 한다.  개발자가 주가되는 것은 라이브러리.

- 기본적인 틀이 있다 - 프레임 워크

  개발자가 무언가를 만들기 위해 하나하나 가져다 쓴다? - 라이브러리

  ![image-20200129131224957](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129131224957.png)

> MVC 구성 형태로 말한다. Model View Controller
>
> 실질적인 일은 model이 다하고, controller가 일을 시키는것, view는 화면에 뿌려주는 것





## 특징

- MTV 패턴 (model, Template, view)

  Model : 데이터 처리 (DB의 테이블) 

  Template : 클라이언트에게 보여줄 UI (HTML) -

  View : Controller와 비슷한 역할, 요청을 받은 후 [모델을 실행한 후] 응답

- Model은 app/models.py 파일 내의 클래스 형식으로 작성 

- Template은 app의 templates 라는 디렉토리 하위에 작성 

- View는 app/views.py 파일 내의 함수 또는 **클래스 형식**으로 작성

> 스프링이랑 다른 점은 모델과 뷰어가 하나의 파일로 함수형태로 제어함. 파일이 나눠지지 않음.
>
> 플라스크는 단순히 보여주고 접속만 하는 초경량화 프레임워크
>
> 장고는 손쉽게 사용할 수 있도록 관리자페이지를 지원해줌.

![image-20200129131936284](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129131936284.png)

> Routing은 웹 서버의 주소별로 나눠주는 기능을 함. 주소를 처리할 함수나 클래스에 연결을 해줌.



## 디렉토리 및 파일 구조

![image-20200129132151162](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129132151162.png)

> 프로젝트 밑에 프로젝트가 또나온다.  왜냐하면 최 상단 프로젝트는 껍데기만에 불과하고, 그 안에 알맹이들을 프로젝트 명으로 분류해야한다. 그래서 이런 구조를 갖게 됌. 이런 프로젝트 아래에 있는 것들을 app이라고 부른다. 
>
> settings.py, urls.py를 주의깊게 봐라. 
>
> settings.py에서 어떤 SQL프로그램을 사용 할 것인지 제어한다. 



## settings.py

프로젝트 환경 설정 파일

\- DEBUG : 개발 시 필요한 메시지(오류 등) 확인

\- ALLOWED_HOSTS : 외부에서 서버에 접속할 때 설정해야함.

\- INSTALLED_APPS : 프로젝트에 App 추가

![image-20200129132637890](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129132637890.png)

\- TEMPLATES : html 등의 템플릿 관련 설정

![image-20200129132712445](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129132712445.png)

> 'BACKEND' : 여기 안의 템플릿을 진자로 바꿔도 구동 가능. 프레임 워크라서. 하나의 기계에 부품 요소들을 바꾼다고 생각 하면 된다.

-DATABASES : 데이터베이스 엔진 설정

![image-20200129132817130](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129132817130.png)

> 데이터베이스를 무엇을 쓸거냐로 보면 됌.

 \- STATIC_URL : Web에서 사용되는 자원 (css, js, image 등) 경로 설정

![image-20200129132915799](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129132915799.png)

> 웹에서 쓰이는 자원들 저장 경로를 저 스태틱 안에 다 넣어주면 된다.





## manage.py

프로젝트 관리 파일

- 프로젝트 관리에 필요한 명령어 사용 가능 

-  runserver : 서버 실행 - startapp : 앱 생성 

- createsuperuser : 관리자 생성 

  > 관리자 비밀번호 설정 가능.

- migrate : 변경사항을 데이터베이스로 반영 

- makemigrations app : app의 모델 변경사항 확인 - shell : 쉘을 통해 데이터 확인 - 
- collectstatic : 여러개의 App 에서 사용하는 static 파일을 한 곳으로 모음