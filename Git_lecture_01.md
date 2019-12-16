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

- `git clone` + [URL]  : github에서 저장소 내려받기



## Github에 파일 추가

1. `git add` <파일이름>  - 이 명령어로 인덱스에 추가

2. `git commit -m` "이번 확정본에 대한 설명" - HEAD에 반영됐다.
3. `git push` origin master - 로컬 저장소 HEAD에 반영
4. `git remote add origin` <원격 서버 주소> - 원격 서버에 반영



## 가지치기 (branch)

![가지치기 예제를 보여드리죠.](https://rogerdudler.github.io/git-guide/img/branches.png)

> 가지는 안전하게 격리된 상태에서 무언가를 만들 때 사용한다. 버전관리하는 것 처럼 이해 하면 쉽다.  master 가지에 따로 다른 가지를 만들어 개발을 진행하고, 나중에 merge를 이용해서 합치면 된다.

- `git checkout - b` feature_x : 'feature_x'라는 이름의 가지를 만들고 갈아탄다.
- `git checkout master` : master가지로 돌아온다.
- `git branch -d` feature_x : 'feature_x'가지를 삭제한다.
- `git push origin` <가지이름> : 다 만들었다면 원격 저장소에 전송한다.



## 갱신과 병합 (merge)

- `git pull` : 로컬저장소를 원격 저장소에 맞춰 갱신
- `git merge` <가지 이름>: 다른 가지에 있는 내용을 master가지에 병합
- `git diff` <원래 가지> <비교 대상 가지> : 변경 내용을 병합하기 전에, 어떻게 바뀌었는지 비교.
- `git tag` 1.0.0 식별자 : 새 버전을 발표할 때 마다 꼬리표를 달아놓을 수 있다.
- `git log` : 식별자를 확인 가능.



