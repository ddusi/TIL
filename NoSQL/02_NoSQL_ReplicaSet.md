## ReplicaSet

- 한개의 primary와 두개의 Secondary로 만들어서 각 구성된 노드가 자신을 제외한 다른 노드들이 작동하는지 Heartbeat를 이용하여 주기적으로 검사한다. 

- Heartbeat: 이 하트비트를 받는 서버는 자신의 상태 코드를 요청한 서버에 전송시키는 것

- Secondary가 사용할 수 없는 상태가 되어도 데이터 복제를 중단하며 프라이머리는 데이터 수신 저장을 계속 담당하여 서버에 문제가 없다. 추후, 다시 연결되면 자동으로 동기화 됨.

- Primary 서버에 장애가 발생되면 Secondary 서버를 Primary 서버가 된다.

  

![image-20200129123403429](C:\Users\ai9198\AppData\Roaming\Typora\typora-user-images\image-20200129123403429.png)





## 서버 실행

```
mongod --dbpath c:/data/primary --port 20000 --replSet replica_test
```



## 서버 접속

```sQL
mongo localhost:20000/admin
```



## ReplicaSet 환경설정

```mariadb
var config = {
	_id:'replica_test', members: [
		{_id:0, host:'localhost:20000'},
		{_id:1, host:'localhost:20001'},
		{_id:2, host:'localhost:20002'}
	]
};
```



### 환경 설정 바꾼것으로 restart

```sql
rs.initiate(config)
```



## 서버에 데이터 입력

```
use log
for(var i = 0; i < 100; i++) {
 db.connect.save( { ip : "test" + i } )
}
```

> 100개의 데이터 순차적으로 입력





## 입력된 데이터 확인

```
use log
db.connect.count()
```







## Sharding

- 대용량 데이터 저장을 위해 데이터를 분산 저장하는 기능

  

```sql
mongod --shardsvr --dbpath c:\data\shard1_1 --port 40001 --replSet firstset
```

`--shardsvr` 중요!



`cls`: cmd창 클리어

`exit`: 서버 나가기



```
mongos --configdb replica/localhost:50001 --port 50000
```

config 서버에서 프라이머리가 어떤건지 등록해주는 것. 



```
db.runCommand( { addshard : 'firstset/localhost:40001,localhost:40002' } )
db.runCommand( { addshard : 'secondset/localhost:40004' } )
db.runCommand( { addshard : 'thirdset/localhost:40007' } )
```

샤드 서버를 등록해야 이용 가능.





