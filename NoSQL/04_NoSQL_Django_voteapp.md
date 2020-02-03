#  장고튜토리얼_투표앱



mysite라는 프로젝트 생성

```python
django-admin startproject mysite 
	#프로젝트 생성
```

```python
python manage.py startapp polls
	#polls app 생성
```

```python
polls/views.py

from django.http import HttpResponse

def index(request):
	return HttpRespons("Hello")
	
	#앱의 views 만듬
```

```python
polls/urls.py #접속사이트 라우팅 만들기

from django.urls import path
from . import views

urlpatterns = [
	path('', views.index, name='index')
]
```

```python
mysite/urls.py #접속사이트 라우팅 만들기

urlpatterns = [
	path('polls/', include('polls.urls')),
]
```

```python
from django.db import models
class Question(models.Model):
   question_text = models.CharField(max_length=200)
   pub_date = models.DateTimeField('date published')
 
class Choice(models.Model):
 question = models.ForeignKey(Question, on_delete=models.CASCADE)
	# 외래키 지정후 참조제약
    # 테이블로 지정하면 그 테이블의 프라이머리 키를 가져온다.
 choice_text = models.CharField(max_length=200)
    # 데이터베이스 튜플 생성
 votes = models.IntegerField(default=0)
	# 데이터베이스 튜플 생성
```



변경된 사항들 데이터베이스에 수정

```python
 python manage.py makemigration
 python manage.py migrate
```



간편하게 데이터베이스 관련 api 테스트 

- shell 접속

  ```python
  python manage.py shell
  ```

- 모델 import

  ```python
  from polls.models import *
  ```

- Question 테이블 데이터 조회

  ```python
  Question.objects.all()
  ```

- 데이터 입력

  ```python
  from django.utils import timezone
  
  q = Question(question_text="what's new?", pub_date=timezone.now())
  
  q.save()
  ```

- 데이터 조회 

  ```python
  #확인 하는 방법 3가지
  Question.objects.all()
  
  print(q.id, q.question_text, q.pub_date)
  
  Question.objects.all()[0].question_text
  
  # filter
  
  # get
  
  #'what'으로 시작하는 데이터 조회
  Question.objects.filter(question_text__startswith='what')
  ```

- 데이터 수정 : 기존 객체의 속성 값을 수정한 후 save() 꼭 해야함

  ```python
  q.question_text = 'What's up'
  q.save()
  ```

  



Question.

  































마이크로소프트사의 애저?

또는 아마존꺼 꼭 익혀둬라.





```python
class Choice(models.Model):
 question = models.ForeignKey(Question, on_delete=models.CASCADE)
	# 외래키 지정후 참조제약
    # 테이블로 지정하면 그 테이블의 프라이머리 키를 가져온다.
 choice_text = models.CharField(max_length=200)
    # 데이터베이스 내용들어가는 곳
 votes = models.IntegerField(default=0)

```





ORM : 오브젝트와 모델을 연결시켜준다는 의미  (자바에선 JPA)

> 연관 관계만 가지고 있으면 관련된 모든 튜플들을 찾아낼 수 있다.
>
> 변수를 지정했을때 계속 연결되어있기 때문에 조심!

```
In [14]: data = Question.objects.get(pk=1)

In [15]: data.question_text = data.question_text + '?'
```

![image-20200131111224931](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200131111224931.png)

```
In [17]: q.choice_set.create(choice_text='Not much', votes=0)     
Out[17]: <Choice: Choice object (1)>

In [18]: Choice(choice_text='The sky', votes=0, question=q)       
Out[18]: <Choice: Choice object (None)>

In [19]: Choice(choice_text='The sky', votes=0, question=q).save( 
    ...: )
```





파이썬 문법

.join <-> .split





```python
def index(request):
    list = Question.objects.order_by('-pub_date')[:10]
    output = ','.join([q.question_text for q in list])
    return HttpResponse(output)
```



post 방식일때 CSRF 기능 적용



파이썬 기반 웹프레임워크는 클라우드 호스팅을 쓰지않으면 사용하기 어렵다. 



무료 호스팅 클라우드

pythonanywhere 무료 3개월



