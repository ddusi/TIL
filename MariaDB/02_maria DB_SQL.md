# SQL



## 1. Structured Query Language 특징

- 관계형 데이터베이스를 위한 표준 질의어
- SEQUEL에서 유래
- ANSI와 ISO에서 표준화 작업 진행
- 대화식 SQL
  - 직접 DBMS에 접근해 질의어를 작성하여 실행
- 삽입 SQL
  - 프로그래밍 언어로 작성된 응용 프로그램에서 삽입





## 2. DDL 데이터 정의어

- CREATE TABLE : 테이블 생성 

  ```mysql
  CREATE TABLE 테이블명 (
   속성명 데이터타입 [NOT NULL] [DEFAULT 기본값]
   [PRIMARY KEY (속성 리스트)]
   [UNIQUE (속성 리스트)]
   [FOREIGN KEY (속성 리스트) REFERENCES 테이블명 (속성 리스트)]
   [ON DELETE 옵션] [ON UPDATE 옵션]
  );
  ```

  - 의 내용은 생략 가능 

  - SQL은 세미콜론(;) 으로 문장의 끝을 표시

  - 대소문자 구분하지 않음

- DROP TABLR : 테이블 제거

  ```SQL
  DROP TABLE 테이블명:
  ```



 [CONSTRAINT 제약조건명] : 특수한 조건을 주기 위해서. 

> 외래키를 사용할 때 주로 사용.

[FOREIGN KEY (속성 리스트) REFERENCES 테이블명 (속성 리스트)]

> FOREIGN KEY  : 내가 부여할 이름 
>
> REFERENCES : 가져올 테이블 





ALTER TABLE member
	DROP AGE;
ALTER TABLE member
	MODIFY EMAIL VARCHAR(100);
	
DESC MEMBER;  : 로그찍듯이 간편하게 살펴볼 수있는 명령어





## 제약조건 조회, 삭제, 수정

> 제약조건은 ALTER로 수정이 불가능하다. 저장하는 곳이 다르기 때문. 



1. 조회 하기 

   TABLE_CONSTRAINTS라는 곳에 저장되기 때문에 조회를 해보자. 

   `SELECT * FROM TABLE_CONSTRAINTS`



2. 삭제하기 

   



```
-- 제약조건 명칭 조회.

-- 제약조건 삭제.

-- 제약조건 입력
SELECT *  FROM TABLE_CONSTRAINTS
--EMP_IBFK_1 제약조건 명칭.
ALTER TABLE EMP DROP FOREIGN KEY EMP_IBFK_1;

ALTER TABLE EMP ADD 
	CONSTRAINT FK_EMP_DEPT
	FOREIGN KEY (DEPTNO) REFERENCES 사원(DEPTNO)
	ON DELETE CASCADE;
	
```

