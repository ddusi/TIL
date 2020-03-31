## 0. BeautifulSoup를 import 하기

```python
# BeautifulSoup 불러오기
from bs4 import BeautifulSoup
```



## 1. BeautifulSoup 불러오기

```python
# 문자열 BeautifulSoup 으로 읽어주기

soup = BeautifulSoup(문자열, 'html.parser')
#파이썬이 아니라 html로 작성되었으니까 파싱해줘! 
```

> "이 문자열은 단순한 텍스트가 아니라 html 구조에 맞게 작성되어있어. 그러니 너도 html 의 관점에서 이 문자열을 이해해줘" 라고 하는 것과 동일합니다. 





## 2. html 내 필요한 부분 선택하기: select()

> 이제 BeautifulSoup 을 사용해서 html 내에서 내가 원하는 부분만 선택해보겠습니다. 
> find(복수는 find_all)와 select(한 개 찾을때에는 select_one) 를 이용한 방법으로 나눌 수 있는데, 사용법이 약간 다릅니다. 
> select 하나만 써도 문제 없이 크롤링 가능합니다. (css selector 를 사용하는 방법으로 더 이해하기 쉽고, 위치를 찾기도 더 쉬운 것 같습니다.)

#### select 함수

```python
# 원하는 정보가 있는 위치 찾기 

soup.select('원하는 정보')  # select('원하는 정보') -->  단 하나만 있더라도, 복수 가능한 형태로 되어있음

soup.select('태그명')
soup.select('.클래스명')
soup.select('상위태그명 > 하위태그명 > 하위태그명')
soup.select('상위태그명.클래스명 > 하위태그명.클래스명')    # 바로 아래의(자식) 태그를 선택시에는 > 기호를 사용
soup.select('상위태그명.클래스명 하~위태그명')              # 아래의(자손) 태그를 선택시에는   띄어쓰기 사용
soup.select('상위태그명 > 바로아래태그명 하~위태그명')     
soup.select('.클래스명')
soup.select('#아이디명')                  # 태그는 여러개에 사용 가능하나 아이디는 한번만 사용 가능함! ==> 선택하기 좋음
soup.select('태그명.클래스명)
soup.select('#아이디명 > 태그명.클래스명)
soup.select('태그명[속성1=값1]')
```

#### select로 가져올 수있는 정보들

1. 태그명 : soup.select('p'), soup.select('span')
2. 클래스명 : soup.select('.class'), soup.select('.div')
3. 아이디 : soup.select('#fruits2'), soup.select('#query')
4. 위치 : soup.select('p > span'), soup.select('p.name > span.price')
5. 구조적 위치 : soup.select('태그[속성명 = 속성값]'), soup.select('a[href = http://test1]')



#### select 써보기

```html
html = '''
<html> 
    <head> 
    </head> 
    <body> 
        <h1> 시장  
            <p id='fruits1' class='name' title='바나나'> 바나나 
                <span class = 'price'> 3000원 </span> 
                <span class = 'inventory'> 500개 </span> 
                <span class = 'store'> 가가가 </span> 
                <a href = 'http://test1'> url1 </a> 
            </p> 

            <p id='fruits2' class='name' title='귤'> 귤 
                <span class = 'price'> 2000원 </span> 
                <span class = 'inventory'> 100개 </span> 
                <span class = 'store'> 나나나</span> 
                <a href = 'http://test2'> url2 </a> 
            </p> 
            <p id='fruits3' class='name' title='파인애플'> 파인애플 
                <span class = 'price'> 5000원 </span> 
                <span class = 'inventory'> 10개 </span> 
                <span class = 'store'> 가가가</span> 
                <a href = 'http://test1'> url1 </a> 
            </p> 
        </h1> 
    </body> 
</html>
'''
soup = BeautifulSoup(html, 'html.parser')  
```



##### 파이썬 코드

```python
soup.select('p')[0]    # p 태그를 가진 그룹 중 첫번째는?
```

##### http 크롤링 정보

```html
            <p id='fruits1' class='name' title='바나나'> 바나나 
                <span class = 'price'> 3000원 </span> 
                <span class = 'inventory'> 500개 </span> 
                <span class = 'store'> 가가가 </span> 
                <a href = 'http://test1'> url1 </a> 
            </p>
```

#### result

```
바나나
```



### 중요!!

```python
# select로 지정한 위치는 설령 단 하나만 찾아낸다고 하더라도, 복수의 그룹 형태로 자료를 가져옵니다.
# 작업을 위해서는 soup.select(필요정보)[0] 처럼 복수의 자료 중 몇번째? 라는 것을 지정해주거나
# 반복문을 통해 하나씩 불러서 작업을 해야 합니다. 


```



### 3. 필요한 정보 가져오기

```python
# 가격을 가져올때(첫 번째 꺼 하나만)
soup.select('p > span.price')[0].text   
※ [0] 을 통해 첫 번째에 나오는 값이라고 한정 시켜줌. 중요!!!!


# 가격을 가져올때(복수)
prices = soup.select('p > span.price')
for price in prices:        # 복수의 가격 정보들에서 하나씩 꺼내어
    print(price.text)       # 텍스트만 화면에 출력한다
```

