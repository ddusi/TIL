# Hacker Rank SQL



1번

```
SELECT * FROM CITY
    WHERE POPULATION > 100000
            AND COUNTRYCODE = 'USA';
```

2번 Revising the Select Query II

```
SELECT NAME FROM CITY
    WHERE POPULATION > 120000
            AND COUNTRYCODE = 'USA';
```

3번 Select All

```
SELECT * FROM CITY
```

4번 Select By ID

```
SELECT * FROM CITY
    WHERE ID = 1661
```

5번 Japanese Cities' Attributes

```
SELECT * FROM CITY
    WHERE COUNTRYCODE = 'JPN';
```

6번 Japanese Cities' Names

```
SELECT NAME FROM CITY
    WHERE COUNTRYCODE = 'JPN';
```

7번 Weather Observation Station 1

```
SELECT CITY, STATE FROM STATION
```

8번 Weather Observation Station 3

```
SELECT DISTINCT CITY FROM STATION
    WHERE ID % 2 = 0;
```

9번 Weather Observation Station 4

```
SELECT COUNT(CITY) - COUNT(DISTINCT CITY) FROM STATION
```

* COUNT라는 함수가 사용 가능하다.

10번 Weather Observation Station 5

```
select CITY,LENGTH(CITY) from STATION order by Length(CITY) asc, CITY limit 1; 
select CITY,LENGTH(CITY) from STATION order by Length(CITY) desc, CITY limit 1; 
```

