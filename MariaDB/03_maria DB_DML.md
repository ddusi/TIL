## DML

> 데이터 조작어



![image-20200120133013882](02_maria DB_DML.assets/image-20200120133013882.png)





## INSERT : 데이터 삽입

- 기본 구조

```SQL
INSERT INTO 테이블명
 [(속성 리스트)]  --> 생략 가능
 VALUES
 (속성의 값 리스트);
```



- '부서' 테이블에 데이터 삽입

```
INSERT INTO 부서 (부서번호, 부서이름) VALUES (1, '인사부');
INSERT INTO 부서 (부서번호, 부서이름) VALUES (2, '연구부');
INSERT INTO 부서 (부서번호, 부서이름) VALUES (3, '홍보부');
```









## SELECT : 데이터 검색

```SQL
SELECT 고객아이디, 고객이름, 나이, 등급, 직업, 적립금
FROM 고객;
```

> 고객 테이블로부터 속성들을 선택해 값을 검색한다. (보여준다.)



```
SELECT *
FROM 고객;
```

> 모든 속성을 검색할 때 쓰는 명령어이지만, 왠만해선 명시해서 쓰는게 좋다. 나중에 프로그래밍을 할 때, 선택하기 어렵기 때문.



```
DESC 고객;
```

> 테이블의 속성을 잘 모를때 검색하기 위한 명령어.



중복된 속성 값을 제외하고 조회.

```
SECLECT DISTINCT 제조업체
FORM 제품;
```







