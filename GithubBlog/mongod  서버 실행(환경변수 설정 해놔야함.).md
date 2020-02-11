mongod : 서버 실행(환경변수 설정 해놔야함.)



```
> db
test
> show dbs
admin   0.000GB
config  0.000GB
local   0.000GB
prod    0.000GB
test    0.000GB
> use test
switched to db test
> show collections
prod
score
test
tour
> db.user.save( { name:'AAA', age:30, address:['서울','신림']})
WriteResult({ "nInserted" : 1 })
> db.uset.find()
> db.user.find()
{ "_id" : ObjectId("5e37af5f0947728ddd33f88a"), "name" : "AAA", "age" : 30, "address" : [ "서울", "신림" ] }
> db.user.save( { name:'AAA', age:30, address:['제주','연동']})
WriteResult({ "nInserted" : 1 })
> db.user.find()                                           ']})
{ "_id" : ObjectId("5e37af5f0947728ddd33f88a"), "name" : "AAA", "age" : 30, "address" : [ "서울", "신림" ] }
{ "_id" : ObjectId("5e37afa80947728ddd33f88b"), "name" : "AAA", "age" : 30, "address" : [ "제주", "연동" ] }
> db.user.find({ age :{$gte : 30 }})
{ "_id" : ObjectId("5e37af5f0947728ddd33f88a"), "name" : "AAA", "age" : 30, "address" : [ "서울", "신림" ] }
{ "_id" : ObjectId("5e37afa80947728ddd33f88b"), "name" : "AAA", "age" : 30, "address" : [ "제주", "연동" ] }
> db.user.find
```



에이젝스로 동기적 사이트는 무조건 셀레니움을 써야한다. 

명시적 슬립

암시적 슬립

절대적 슬립 - time sleep

헤더값을 바꿔가면서 크롤링하면 차단 당할 확률이 적다.











```
use exam

db

show collections

db.product.save({ company:'광동제약', prd_name:'제주삼다수2L', price:'800'})
db.product.save({ company:'스파클', prd_name:'스파클2L', price:'460'})
db.product.save({ company:'농심', prd_name:'백두산 백산수2L', price:'670'})
db.product.save({ company:'동원F&B', prd_name:'동원샘물2L', price:'500'})

db.product.find()
```

```
>use exam
switched to db exam

> db
exam

> show collections
product

>db.product.save({ company:'광동제약', prd_name:'제주삼다수2L', price:'800'})
>db.product.save({ company:'스파클', prd_name:'스파클2L', price:'460'})
>db.product.save({ company:'농심', prd_name:'백두산 백산수2L', price:'670'})
>db.product.save({ company:'동원F&B', prd_name:'동원샘물2L', price:'500'})
WriteResult({ "nInserted" : 1 })

> db.product.find()
{ "_id" : ObjectId("5e37d7ec0947728ddd33f88e"), "a" : 1 }
{ "_id" : ObjectId("5e37d9400947728ddd33f894"), "company" : "스파클", "prd_name" : "스파클2L", "price" : "460" }
{ "_id" : ObjectId("5e37d9400947728ddd33f895"), "company" : "농심", "prd_name" : "백두산 백산수2L", "price" : "670" }
{ "_id" : ObjectId("5e37d9430947728ddd33f896"), "company" : "동원F&B", "prd_name" : "동원샘물2L", "price" : "500" }

```

