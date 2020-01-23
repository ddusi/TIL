# Python DB

## 01.  파이썬에서의 DB

- MySQL, Oracle, MSSQL, MongoDB, SQLite 등 데이터베이스 사용 가능!

- 데이터베이스 제품별로 맞는 라이브러리 이용해야한다.

- 일반적인 사용 절차

  1. 데이터베이스에 맞는 모듈 설치 및 import

  2. 데이터베이스에 접속

  3. Cursor 객체 생성

  4. Cursor 객체의 SQL 실행 메소드를 사용하여 CRUD실행

     - 조회의 경우 실행 결과를 추출

  5. 데이터베이스 작업 완료 후 commit (저장)

  6. Cursor 객체 Close

     > 항상 close를 해줘야 한다. 만약 안한다면 다른사람이 접속을 못할 수도 있다. 
     >
     > 예를들어 한 DB같은 경우에는 1000명 정도만 동시접속 가능하기 때문이다.

  7. 접속객체 close



## 02. 테이블 생성

#### - mysql 테이블 생성

```python
import pymysql # 모듈 import


conn = pymysql.connect(
    host='localhost', user='root', password='123',
    db='python', charset='utf8') 
# 데이터베이스 접속

cursor = conn.cursor() #Cursor 객체 생성

sql = '''CREATE TABLE mysql (
            ID INT PRIMARY KEY AUTO_INCREMENT,
            TITLE VARCHAR(100), CONTENT VARCHAR(100))''' #MySQL문 작성

cursor.execute(sql) #SQL문 실행
conn.commit()
cursor.close()
conn.close()
```

> python이라는 데이터베이스에 mysql 테이블을 생성. 
>
> 파이썬 안에서는 DB를 명령어로 만들수 없기때문에 꼭 먼저 만들어줘야 한다.



#### - 예외처리 try-except

```python
import pymysql # 모듈 import

try:
    conn = pymysql.connect(
        host='localhost', user='root', password='123',
        db='python', charset='utf8') 
    # 데이터베이스 접속

    cursor = conn.cursor() #Cursor 객체 생성

    sql = '''CREATE TABLE mysql (
                ID INT PRIMARY KEY AUTO_INCREMENT,
                TITLE VARCHAR(100), CONTENT VARCHAR(100))'''

    cursor.execute(sql)

    conn.commit()

    cursor.close()
    conn.close()
except pymysql.InternalError as e:
    print(e)
```

> try에서 실행하고 만약 에러가 뜬다면 except로 어떤 오류인지 표기

#### - 예외처리 try-except-finally

```python
import pymysql # 모듈 import

try:
    conn = pymysql.connect(
        host='localhost', user='root', password='123',
        db='python', charset='utf8') 
    # 데이터베이스 접속

    cursor = conn.cursor() #Cursor 객체 생성

    sql = '''CREATE TABLE mysql (
                ID INT PRIMARY KEY AUTO_INCREMENT,
                TITLE VARCHAR(100), CONTENT VARCHAR(100))'''

    cursor.execute(sql)

    conn.commit()

    cursor.close()
    conn.close()
except pymysql.InternalError as e:
    print(e)
finally:
    conn.close() #try 내의 지역변수
```



#### - 예외처리 try-with-except-finally

```python
import pymysql # 모듈 import

try:
    conn = pymysql.connect(
        host='localhost', user='root', password='123',
        db='python', charset='utf8') 
    # 데이터베이스 접속

    with conn.cursor() as cursor: #Cursor 객체 생성

        sql = '''CREATE TABLE mysql (
                    ID INT PRIMARY KEY AUTO_INCREMENT,
                    TITLE VARCHAR(100), CONTENT VARCHAR(100))'''
        cursor.execute(sql)
        conn.commit()
except pymysql.InternalError as e:
    print(e)
finally:
    if conn:   # 만약 conn이라면 
        conn.close() #try 내의 지역변수        
```



## 03. 테이블 삽입, 수정, 삭제

#### - INSERT

```python
import pymysql # 모듈 import


conn = pymysql.connect(
    host='localhost', user='root', password='123',
    db='python', charset='utf8') 
# 데이터베이스 접속

cursor = conn.cursor() #Cursor 객체 생성

sql = '''INSERT INTO mysql (ID, TITLE, CONTENT)
        VALUES (null, %s, %s)
            ''' #insert SQL문법

cursor.execute(sql, ('제목A', '내용Z')) #인자 설정!
conn.commit()
cursor.close()
conn.close()
```



#### - UPDATA

```python
import pymysql # 모듈 import


conn = pymysql.connect(
    host='localhost', user='root', password='123',
    db='python', charset='utf8') 
# 데이터베이스 접속

cursor = conn.cursor() #Cursor 객체 생성

sql = '''UPDATE mysql SET TITLE = %s
        WHERE ID = %s
            ''' #SQL문 작성
cursor.execute(sql, ('제목수정됨', 5)) #인자 설정
conn.commit()
cursor.close()
conn.close()

```



#### - DELECT

```python
import pymysql # 모듈 import


conn = pymysql.connect(
    host='localhost', user='root', password='123',
    db='python', charset='utf8') 
# 데이터베이스 접속

cursor = conn.cursor() #Cursor 객체 생성

sql = '''DELETE FROM MYSQL
        WHERE id = %s
            '''
cursor.execute(sql, (2))
conn.commit()
cursor.close()
conn.close()
```





## 04. SELECT문을 사용하기

- SELECT문을 그냥 쓰게 된다면 SELECT문이 적용된 튜플의 숫자만 나온다. 그러므로 변수로 담아서 출력을 해줘야 한다.

```python
import pymysql # 모듈 import


conn = pymysql.connect(
    host='localhost', user='root', password='123',
    db='python', charset='utf8') 
# 데이터베이스 접속

cursor = conn.cursor() #Cursor 객체 생성

sql = '''SELECT title, content FROM mysql
            '''  #SQL문 작성
cursor.execute(sql)
result = cursor.fetchmany() #결과를 fetchmany라는 함수로 담아서 출력해야함.
print(result)
print(result[0])
print(result[0][1])

conn.commit()
cursor.close()
conn.close()
```



#### - 데이터 조회에 쓰이는 라이브러리 함수들

1. fetchall(): 모두 조회

   ```python
   result = cursor.fetchall()
   for roy in result:
   	print(row, type(row))
   ```

   

2. fetchone(): 한개 데이터 조회

   ```python
   result = cousor.fetchone()
   print(result, type(result))
   ```

   

3. fetchmany(): 여러개 데이터 조회

   ```python
   result = cousor.fetchmany()
   print(result, type(result))
   ```

   













