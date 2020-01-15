# 모듈(module)

## 01. 모듈 (module) = 라이브러리

- 파이썬 코드를 논리적으로 묶어서 관리하고 사용할 수 있도록 만들어 둔 것 

- 보통 py 확장자를 가지는 1개의 파이썬 파일이 하나의 모듈이 됨

- 함수, 클래스, 변수를 정의할 수 있으며, 실행 코드도 포함 가능

- 기본적으로 많은 표준 라이브러리 모듈을 제공하고 있으며,

  필요에 따라서 외부 라이브러리 모듈을 설치하여 사용하는 것도 가능

- import문을 사용하여 1개 이상의 모듈을 불러들임

- 기본사용

  ```python
  import random
  
  num = random.randint(1, 10)
  print(num)
  ```





## 02. 모듈 사용법



#### 모듈 작성 - Calculator.py

```python
def plus(first, second):
 return first + second
def minus(first, second):
 return first - second
def multiply(first, second):
 return first * second
def divide(first, second)
```



#### 모듈 활용

```python
import Calculator
#import Calculator as cal : as 뒤에 cal이라는 별칭을 지정

result1 = Calculator.plus(5, 3)
print(result1)
result2 = Calculator.minus(5, 3)
print(result2)
result3 = Calculator.multiply(5, 3)
print(result3)
result4 = Calculator.divide(5, 3)
print(result4)
```



#### import 말고 from으로 활용

```python
#import로 불러오면 항상 클래스.함수()를 써야한다.
import random
random.randint(1, 3)

# 하지만, from A import B 를 활용하면 바로 사용 가능.
from random import randint
randint(1, 3)
```





## 패키지 (Package)

모듈을 계층(디렉토리) 구조로 관리하는 것 







예외처리

내장함수

외장함수

정규식

크롤링

데이터베이스







