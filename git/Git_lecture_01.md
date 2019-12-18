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
- `ls -a` : 숨김파일도 나열함
- `pwd` : 현재 폴더 경로 출력
- `mkdir` + [폴더명] : 폴더 생성
- `cd` + [폴더명] : 폴더로 이동
- `cd ..` : 상위폴더로 이동
- `.` : 현재폴더를 뜻함
- `code .` : 현재 폴더로 경로가된 code창 열기
- `code . test.py` : 현재 폴더로 경로가 지정된 code창을 test.py 파일명으로 열기
- `touch` + [파일명.확장자] : 파일 만들기



## Git 설정

1. `git init` : 폴더를 git으로 관리하기 시작함.
   - .git 파일 생성.
   - git init 선언한 폴더 하위에 또다른 git init가 있으면 안된다. (중복 불가)
   - 설정한 폴더 기준으로 하위 폴더 모두 관리
2. 이메일, 이름 설정하기 
   1. git config --global user.email["이메일"]
   2. git config -- global user.name["이름"]
3. `git status` : git의 상태를 확인



## Github에 파일 추가

1. `git add` <파일이름>  - 이 명령어로 인덱스에 추가

   ​	`git add .` - .은 모든 파일을 가리키기 때문에 **모든파일**을 인덱스에 추가

2. `git commit -m` "메모" - HEAD에 반영됐다.

   - commit 관리자 화면에 빠지면 `esc` 연타후 `:q`를 입력해서 빠져나온다.

3. `git push origin master` - 로컬 저장소 HEAD에 반영

4. `git remote add <원격저장소의 이름> <원격 서버 주소>` - 원격 서버에 반영 

   - 첫번째 원격 저장소의 이름은 보통 origin으로 쓴다.

   - `git remote -v` : 상세하게 정보 보는 것.

   

## 가지치기 (branch)

![가지치기 예제를 보여드리죠.](https://rogerdudler.github.io/git-guide/img/branches.png)

> 가지는 안전하게 격리된 상태에서 무언가를 만들 때 사용한다. 버전관리하는 것 처럼 이해 하면 쉽다.  master 가지에 따로 다른 가지를 만들어 개발을 진행하고, 나중에 merge를 이용해서 합치면 된다.

- `git checkout - b` feature_x : 'feature_x'라는 이름의 가지를 만들고 갈아탄다.
- `git checkout master` : master가지로 돌아온다.
- `git branch -d` feature_x : 'feature_x'가지를 삭제한다.
- `git push origin` <가지이름> : 다 만들었다면 원격 저장소에 전송한다.



## Push and Pull과 merge

- `git pull` : 원격저장소에서 데이터를 가져오는 것
  - `git pull` origin master  
- `git push` : 원격 저장소에 데이터를 보내는 것 
  - `git push` origin master
- `git clone` [URL] : 처음에 프로젝트 전체를 복사해서 가져오는 것 
- `git merge` <가지 이름>: 다른 가지에 있는 내용을 master가지에 병합
- `git diff` <원래 가지> <비교 대상 가지> : 변경 내용을 병합하기 전에, 어떻게 바뀌었는지 비교.
- `git tag` 1.0.0 식별자 : 새 버전을 발표할 때 마다 꼬리표를 달아놓을 수 있다.
- `git log` : 식별자를 확인 가능.



## Git 수정

- `rm` : 파일 지우는 명령어

  - `rm -r` : 폴더 지우는 명령어

-  `mv` [이동할 폴더]/ [이동될 장소] : 폴더 이동 명령어

- `git log` : github 로그 보기

  - git log --oneline : 한줄로 로그 보기

  