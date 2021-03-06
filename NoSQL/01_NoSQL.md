# NoSQL (Not Only SQL)



## 1. 등장배경

- 기존 컴퓨팅 시스템은 기업의 업무를 **자동화하고 효율화**하는데 목적이 있음
- 기업의 복잡한 데이터를 저장하고 데이터 간의 관계를 정의하고 분석
- 생성되는 데이터의 양은 한계를 가지고 있음
- 2000년대에 들어서면서 인터넷의 발전과 함께 sns 활성화
- 기존의 기업 시스템에서 볼 수 없었던 대규모 데이터 생산
- 한정된 규모의 복잡성이 높은 데이터에서 단순한 대량의 데이터로 넘어감
- 기존 데이터 저장 시스템으로는 소화하기 힘든 여러가지 한계가 발생되었고 새로운 형태의 데이터 저장 기술을 요구하게 됨
- 구글의 Bigtable, 아마존의 Dynamo 논문이 발표되면서 새로운 데이터 저장 기술을 만들어내는 시발점이 되었고 NoSQL 등장 

> SNS서비스 활성화로 대규모 데이터 생산 > 기존 기업데이터에 비해 매우 단순한 형태 > 복잡성을 띈 데이터베이스 보단 단순 대용량 데이터베이스 기술 요구!





## 2. 특징

- NoSQL은 RDBMS와 다른 형태의 데이터 저장 구조를 총칭
- 제품에 따라 특성이 매우 달라서 한의 제품군으로 정의할 수 없음
- 하나의 고성능 머신을 사용하지 않고 평범한 다수의 일반 pc를 연결하여 데이터를 처리하는 구조를 가짐
- 다수의 서버에 데이터를 상호 복제하여 분산 저장할 수 있기 땜문에 특정 서버에 장애가 발생하여도 데이터 유실이 거의 없음
- 테이블 설계 시 스키마가 정해지지 않기 때문에 유동적으로 데이터 저장 가능



#### - NoSQL을 이용하는 이유

RDBMS와 달리 하나의 고성능 머신을 이용하지 않고 여러개의 컴퓨터를 이어서 사용가능하기 때문에 클라우드와 같은 서버에 적합. = 확장성이 좋다. 

관계형데이터베이스 처럼 복잡성이 필요없고 단순한 대용량 데이터를 저장/조회만을 위해 만들어짐. 정형화된 프로그램은 없다.  





## 3. NoSQL 종류

### 1. key /value Store 

- 대부분의 NoSQL은 Key/value 개념 지원

- Unique Key에 하나의 Value를 가지고 있는 형태 

- 비슷한 것은 Redis, MongDB

  ![image-20200129000135084](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129000135084.png)

  

### 2. Ordered Key / Value Store

- 내부적으로 key를 순서대로 정렬하여 저장.
- 키안에 Column:Value 조합으로 된 여러개의 필드를 가지는 구조
- HBase, Cassandra

![image-20200129000158169](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129000158169.png)



> 하나의 키 안에 컬럼:벨류 가 있다. { key : [ columb : Value ]}



### 3. Document Key / Value Store

- key / value store의 확장된 형태

- Document 라는 형태로 구조화된 데이터 형태를 사용

  > Document의 종류 > Json, XML, YAML 등

- 복잡한 계층구조 표현 가능

- MongoDBm CouchDB

  ```JSON
  USER: {
  	name : "Terry.Cho",
  	sex : "male",
  	address: { state : "Seoul"
  				nationality : "KOREA"
  				}
  }
  ```

  

### 4. Graph Store

- 모델링 하기 어려운 복잡한 계층 구조를 단순하고 신속하게 사용
- Node, Edge, Property로 구성
- Neo4j





## 4. NoSQL의 장점

- 클라우드 환경에 적합

  - 하드웨어 확장에 유연한 대처 가능
  - 분산 / 병렬 처리 가능 (데이터가 독립적인 모델로 설계)

- 유연한 데이터 모델

  - 비정형 데이터 구조
  - 정해진 스키마를 따르지 않고 다양한 모든 형태를 저장

  



## 5. NoSQL의 단점

- 각 제품별 이해 학습 필요
- 일반적인 서버 - 클라이언트 환경에 적합하지 않음
  - 회원정보 - 게시글 작성
  - 게시글 번호 - 댓글 작성



## 6. MongoDB

- 10gen 사에서 개발한 제품 (개발언어 C++)
- 스키마를 고정하지 않으므로 다양한 형태의 데이터 저장 가능
- JSON형태의 데이터 사용
- join이 불가능하기 때문에 join이 필요없도록 데이터를 설계해야함.
- 메모리에 의존적이라서 메모리의 크기로 성능이 좌우
- 주로 데이터를 저장하여 조회만 하고 삭제나 수정이 없는 업무에 적합
- 관계나 트랜잭션이 중요한 금융 / 결제/ 게시판 등의 서비스에는 부적합





## 7. Document Data Model

- Key / Value로 이루어진 데이터 집합

- value는 일반적으로 문자열, 숫자, 날짜를 사용하며 배열([]) 또는 다른 Document를 지정하는 것도 가능

  > 도큐먼트 안에 도큐먼트 가능

- 하나의 문서에 필요한 정보를 모두 담아야함.

- 종이문서 한장에 모든 내용을 볼 수 있도록 설계





## 8. MongoDB 설치

#### <a href='https://mongodb.com'>몽고DB 다운로드</a>

- 실행파일 

  [설치경로]/bin/mongo.exe

- RDBMS와 MongoDB 용어 비교

  

  |         SQL 사용 용어         |        MongoDB 사용 용어        |
  | :---------------------------: | :-----------------------------: |
  |           database            |            database             |
  |             table             |           collection            |
  |              row              |         document / BSON         |
  |            column             |              field              |
  |             index             |              index              |
  |          table joins          |     임베디드 문서 / linking     |
  | primary key, 유일한 고유 컬럼 | primary key, _id 필드 자동 생성 |
  |          aggregation          |     aggregation 프레임워크      |

  



## 9. MongoDB 명령어들

1. show dbs

2. use test

3. db.test.save({a:1})

4. db.stats()

5. show collections

6. db.score.save({ a:99})

7. db.score.find()

8. for( i = 0; i < 5; i++) { db.score.save( { a : i, exam : 5 } ) }

9. db.score.find()

10. db.score.find( { a : 2 } )

11. db.score.find( { a : { $gt : 15 } } )

12. **AND**

	 db.score.find( { a : { $gte : 2, $lte : 4 } } )

    ```shell
    비교연산자
    $gt : > 보다 크다
    $lt : < 보다 작다
    $gte : >= 보다 크거나 같다
    $lte : <= 보다 작거나 같다
    $ne : != 같지 않다.
    ```

13. **OR**

    db.score.find( { $or : [ { a : { $lt : 1 } }, { a : { $gt : 9 } } ] } )

14. **IN - is in array**

    db.score.find( { a : { $in : [2, 3, 4] } } )

    > 값중에 [2, 3, 4] 가 들어있는 것만 조회를 해라.

15. **NOT IN - is not in array**

    db.score.find( { a : $nin : [ 2, 3, 4 ] } )

    > 값 중에 [2,3,4]가 들어있지 않은 것만 조회를 해라

16. db.score.find( { exam : { $exists : true } } )

    > 데이터 필드 존재 유무 확인

17. db.score.find( { }, { a : 1, exam : 1, _id : 0 } )

    > 조회할 필드 선택 ( 0: 해제, 1: 선택)







```sql
db.prod.find({$or:[  ]})
{ price : {$gte: 1010, $lte: 1020}}
{ price : {$gt: 1070, $lt: 1100}}

db.prod.find({$or:[{ price : {$gte: 1010, $lte: 1020}}, 
                  { price : {$gt: 1070, $lt: 1100}} ]})

for (var i = 1; i <= 100; i++) {
	db.prod.save({
		name: 'name-' + i,
		price: 1000 + i,
		count: i * 10
	})
}
```





데이터가 너무 많기 때문에 자동으로인덱싱 작업이 일어날 수 있도록 해주는 것 noSQL

Rdbms에서는 키를 주는게 일반적

인덱스를 항상 동기화 시킬 필요가 있다.

빈번하게 사용하게되면 컴퓨터에 부하가 일어난다. 



MongoDB는 키가 있냐는게 중요한게 아니라 이런 데이터가 있냐 없냐가 중요

데이터를 주로 저장, 조회만 하고 삭제나 수정이 없는 없무에 적합.



인덱스를 어떻게 지정해 줄수 있을 까?

### 인덱스 확인

```
db.person.getIndexes()
# 데이터 안에 무엇이 들어 있는가? 보는 것
# person안에 데이터가 없지만 먼저 인덱스를 주는 것이 가능
```



### 인덱스 생성 (1: 오름차순, -1: 내림차순)

```
db.person.ensureIndex({ name : 1 })

```



### 인덱스 생성 ( unique : 중복 데이터 저장 불가)

```
db.person.ensureIndex( { name : 1 }, { unique : true})
```



