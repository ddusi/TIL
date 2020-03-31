## python 문제풀다가 알게된 것



#### 1. 파이썬 정렬시 특정 기준으로 정렬하는 방법 (Key)

list.sort(), sorted()를 통한 정렬시! 비교기준이 되는 key 파라미터를 가질 수있다. 
ex) list.sort(a, key=?)
    sorted(a, key=?)
    
sorting 할때 키 값을 기준으로 정렬



- 키 파라미터의 값은 하나의 인자를 받고 정렬 목적을 위한 키를 리턴하는 함수가 되어야 함.

```python
    #공백을 기준으로 문자열을 나누어 리스트로 변환한다. 
    #리스트로 변환시
    
    sorted("This is a test string form Andrew".split(), key=str.lower)
```
>  string문자열 기준으로 내림차순으로 정렬된다.



#### 2. 복잡한 객체를 정렬할 때 자주 사용하는 key=lambda 리스트: 인자 []
```python
    student_tuples = [
...     ('john', 'A', 15),
...     ('jane', 'B', 12),
...     ('dave', 'B', 10),
... ]

>>> sorted(student_tuples, key=lambda student: student[2])
```

>  key=lambda student: student[2] key에 람다를 넣으면 stuendt라는 리스트 안에서 [2]인자 기준으로 정렬한다는 것. sort by age





#### 3. dict.fromkeys() 함수

```
#리스트 선언
test=['가', '나', '다', '라']
```

원래 이런식으로 값을 가지고 있는 리스트를 딕셔너리 형태로 바꿔준다. 

```python
test=dict.fromkeys(test)
>>>{'가': None, '나': None, '다': None, '라': None}
```

이런식으로 원래 리스트에 있는 값은 키값이 되고, velue값은 none로 저장된다. 이때 velue값을 넣어보자.

```python
test['가']=10
test['나']=22

>>>{'가': 10, '나': 22, '다': None, '라': None}
#딕셔너리는 key값은 수정할 수 없지만, velue값은 언제든지 수정가능.
```





#### 4.  join() 함수

join()함수는 각 문자 사이에 문자를 삽입함. 

```python
'/'.join('가나다라')
>>> '가/나/다/라'
```

