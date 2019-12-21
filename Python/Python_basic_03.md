# telegram 챗봇 만들기

> 나만의 델레그램 챗봇 만들기 



1. 챗봇 생성
   - http://www.telegram.pe.kr 에서 PC판 설치
   - BotFather에 들어가 /newbot 입력 > 내 bot이름 설정 후 token을 받을 수 있음.
   - 검색창에 내 bot이름을 검색하여 찾을 수 있음.
   - 챗봇과 정보를 주고받을 `app.py` Flask파일 만들기.



```

from flask import Flask

app = Flask(__name__)


if __name__ == ("__main__"):
    app.run(debug=True)
```





2. 텔레그램에서 @
   - 