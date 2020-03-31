경영통계학 공부 ( 판다스 )

-판다스 7,8,9,19 장 







melt() 메서드 : 중복된 열들을 하나의 열로 묶어서 표기해줌. 

- id_vars='열이름'
- var_name='income'
- value_name='count'



가상 데이터의 여러 열을 하나로 정리하기 

1. melt()
2. pivot_table



pivot_table() :  이 메서드는 좀더 아름답게 이쁘게 열을 분리해주는 메서드

```python
.pivot_table(
	index:
	columns:
	values:
)
```

이때, 결과물들의 인덱스를 하나하나 붙이고 싶으면 reset_index 메서드를 사용한다.

```
weather_tidy.reset_index()
```



drop_duplicates() : 중복된 행들을 지우는 메서드



billboard_songs['id'] = range(len(billboard_songs))

> 손쉽게 id인덱스를 부여하는 방법



대상테이블.merge(추가할 테이블, on='기준이 될 열들')

 



