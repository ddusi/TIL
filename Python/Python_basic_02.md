# 터미널 명령어

- python - m venv [가상환경 이름] : 파이썬아 가상환경을 만들어줘 

- source venv/scripts/activate : 가상환경 실행

  > source venv/bin/activate : 맥에서

- deactivate : 가상환경 끄기

- $ pip freeze > requirements.txt : 메모장에 모듈 정보들 저장.

- $ pip install -r requirements.txt : 메모장에 저장된 모듈들을 설치해라.

  > 모듈관리하기 쉬움

-  pip install requests : requsts라는 모듈을 설치

  > requsts 
  >
  > BeautifulSoup4
  >
  > 

- **pandas (python data analysis library)**

  > https://3months.tistory.com/292

- **Jupyter Notebook**
- python -m pip install --upgrade pip : pip 업그레이드



# 라이브러리







# 크롤링

> Web상에 존재하는 컨텐츠를 수집하는 작업 

1. TML 페이지를 **가져와서**, HTML/CSS등을 **파싱**하고, 필요한 데이터만 추출하는 기법
2. **Open API(Rest API)**를 제공하는 서비스에 Open API를 호출해서, 받은 데이터 중 필요한 데이터만 추출하는 기법
3. **Selenium**등 브라우저를 프로그래밍으로 조작해서, 필요한 데이터만 추출하는 기법

- 크롤링에 필요한 라이브러리는 requests, BeautifulSoup



- 미국 달러환율 정보 크롤링 연습

```shell
import requests

url = "https://finance.naver.com/sise/"

request = requests.get(url)
print(request)
```

**result**

```shell
$ python kospi.py 
<Response [200]>
(venv) 
```

-  여기서 200은 HTTP의 응답코드이다. 

  - 200 : 성공적으로 처리 

  - 404 Not found : 찾는 리소스가 없다.

  



- **미국 달러환율** 정보 크롤링 연습

  ```python
  import requests		#requests 라이브러리를 불러온다.
  from bs4 import BeautifulSoup		#bs4에 있는 BeautifulSoup 라이브러리를 불러온다.
  
  url = "https://finance.naver.com/marketindex/"		#url변수안에 HTML주소를 불러온다.
  req = requests.get(url).text	#req변수 안에 requests를 이용하여 get방식으로 url변수를 불러온다.
  
  soup = BeautifulSoup(req, 'html.parser')	#json, xml 다 파싱가능
  #파이썬은 HTML을 읽어올 수 없기 때문에 BeautifulSoup를 사용하여 파싱한다.
  
  exchange = soup.select_one('#exchangeList > li.on > a.head.usd > div > span.value')
  print(exchange.text)
  ```

  **result**

  ```python
  $ python exchange.py 
  1,164.50
  ```



- **네이버 실시간 검색어** 크롤링 연습

  ```python
  import requests
  from bs4 import BeautifulSoup
  
  url = 'https://www.naver.com'
  
  req = requests.get(url).text
  data = BeautifulSoup(req, 'html.parser')
  sel = '#PM_ID_ct > div.header > div.section_navbar > div.area_hotkeyword.PM_CL_realtimeKeyword_base > div.ah_roll.PM_CL_realtimeKeyword_rolling_base > div > ul > li > a > span.ah_r, span.ah_k'
  
  search = data.select(sel)
  for item in search:
      print(item.text)
  ```

  **result**

  ```python
  1
  트럼프 탄핵
  2
  가결
  3
  최윤희
  4
  선미
  5
  트럼프
  
  ~
  
  20
  최성해
  ```

  



# API

공공데이터 주소 : https://www.data.go.kr/

더무비 데이터베이스 : https://www.themoviedb.org/



# vim 모드



단축키 모드 : esc

- 방향키
  - h : ←
  - j : ↑
  - k : ↓
  - l : →





텍스트 모드  

- a : 커서 앞쪽에서 시작
- i : 커서 뒤쪽에서 시작
- shift + a : 줄 맨 끝에서 시작
- shift + i : 줄 맨 앞에서 시작
- - 



​	

# 정보

- http://gitignore.io/





















