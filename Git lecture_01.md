# Git

## => 코드 관리도구, 버전 관리 도구 SCM(Source Code managerment)

- 리눅스 ,코드 관리도구, git 창시자 : 리누스 토르발즈

- git 만든 이유 인터뷰 영상

  https://www.youtube.com/watch?v=4XpnKHJAok8

  = git은 어렵다.

- git은 버전을 통해 관리한다.

- git은 폴더 단위로 관리한다. ('mkdir 만들고자 하는 폴더명')

- LS 명령어: 디렉토리 리스트

- git은 스냅샷 찍는 형식의 저장방식. commit

# CLI

커맨드 라인 인터페이스

### 터미널 명령어들

- `ls` : 폴더 내부의 파일 & 폴더를 나열

- `pwd` : 현재 폴더 경로 출력

- `mkdir` + [폴더명] : 폴더 생성

- `cd` + [폴더명] : 폴더 변경

- `cd ..` : 상위폴더로 변경

- `git init` :  폴더 관리해줘.

- `ls -a` : 숨김 파일도 보여줘

- `git status` : git의 상태

- `touch` + [파일명.확장자] : 파일 만들기

- `rm` + [파일명] : 파일 삭제

- `git add` + [파일명]: git 사진대에 올리는 것

- git config --global user.email ["이메일"]

  git config --global user.name ["이름"]
  
- git commit -m ["메모"] : 사진을 찍는 것. (저장)

- `git log` : 로그 보는것

- `git checkout `: 과거로의 여행

- `git checkout master`: 현재로 돌아오는 것

- git remote add [저장소의 별명] [원격저장소 주소] : 저장소 첫번째는 보통 origin

- `git push` origin master : github에 업로드 

