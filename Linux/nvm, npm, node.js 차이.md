# nvm, npm, node.js 차이



## nvm - Node Version Manager

1. node.js의 버전 관리자. node.js의 각 버전을 유지하면서 시스템을 구성해야 하는 경우를 위해 사용한다. 같은 시스템 안에서 여러 node.js를 사용하기 위해 버전별로 Node.js 환경을 격리시키는 역할

2. nvm 은 Node.js를 설치하는 툴

   Debian 계열 리눅스에서는 `$ apt-get install nodejs`하면 쉽게 설치되는데, 이렇게 하면 OS에서 직접 설치를 하게 되면 여러 버전을 관리할 수가 없다.

   그렇기 때문에 먼저 nvm을 설치하고, 설치한 nvm을 통하여 원하는 특정 버전의 node.js를 원하는 조건에 따라 복수로 설치하는 방법이 나중을 위해서는 더 좋은 방법이 될 수 있다.

## npm - Node Package Manager

노드 패키지 매니저. 간단하게 얘기하면 npm 서비스를 통하여 Node.js로 개발된 프로그램을 편리하게 설치, 업데이트 및 삭제를 해주는 프로그램.

npm 은 Node.js 를 OS 에 직접 설치하였든 nvm 으로 설치하였든지에 관계없이, Node.js 가 설치된 상태에서(Node.js 를 설치하면 npm 도 같이 설치됨.) npm 명령어를 이용하여 npm 서비스에 등록된 Node.js 로 작성된 패키지를 관리하는 프로그램 입니다.

## 설치하는 순서!

**nvm ➝ Node.js ➝ npm**⭕️

or

**apt or yum ➝ Node.js ➝ npm**⭕️ (비추천)

but,

Node.js ➝ nvm ❌ (불가능)

```
(1) nvm 을 설치하고 설치한 nvm 을 이용하여 원하는 조건으로,
(2) Node.js 를 설치한 후에,
(3) npm 을 이용하여 필요한 패키지를 추가 설치한다.
```

참고

[nvm 과 npm 구별하기 - LYNMP](https://lynmp.com/ko/article/tb585d114096490055)

## 내 우분투에 Node.js가 설치 되어있을까?

ubuntu에는 기본적으로 JDK, Python, Node.js등이 설치되어있다. 그러므로 설치 되어있는지 확인!

```
$ node --version
$ npm --version
```

< nodejs 공식 사이트 >

[Node.js](https://nodejs.org/en/)

## nvm Install

쉘에서 바로 설치하는 명령어

```
$ curl -o- <https://raw.githubusercontent.com/creationix/nvm/v0.33.2/install.sh> | bash
```

잘 설치되었는지 확인하는 방법

- Home 디렉토리에 .nvm이 생겼는지 확인해보자.

  ```
    ls -a \\ grep .nvm
    cd .nvm
  ```

- 이렇게 생성된 .nvm 폴더를 운영체제 계정의 프로필에 등록하면 된다. 다시 `$HOME`디렉터리에서`.profile`이나`.bashrc` 파일을 찾아서 가장 마지막 줄에 다음 코드를 추가해준다.

  ```
    export NVM_DIR="$HOME/.nvm" [ -s "$NVM_DIR/nvm.sh" ] && . "$NVM_DIR/nvm.sh" # This loads nvm
  ```

- zsh를 사용한다면 `~/.zshrc` 에 스크립트를 추가해줘야 한다.

  ```
    export NVM_DIR="$HOME/.nvm"
    [ -s "$NVM_DIR/nvm.sh" ] && \\. "$NVM_DIR/nvm.sh"  # This loads nvm
    [ -s "$NVM_DIR/bash_completion" ] && \\. "$NVM_DIR/bash_completion"  # This loads nvm bash_completion
  ```

## nvm 사용법

`$ nvm ls` : 설치되어 있는 node.js 목록을 보여준다.

`$ nvm current` : 사용중인 버전 확인

`$ nvm install version` :  버전에는 특정 버전의 `6.10.3` 와 같은 숫자를 넣을 수도 있지만 가장 최신 버전을 설치하는 명령어는 `--lts` 이다.

`$ nvm use system` :  사용중인 버전을 바꾸는 명령어.

`$ nvm uninstall version` :  선택한 버전을 삭제하는 명령어.

`$ node -v` : node가 잘 설치되어있는지 확인

`$ command -v nvm` : nvm이라는 값이 출력되면 nvm이 잘 설치 된것.

`$ nvm ls-remote` : 설치된 모든 node.js의 버전을 조회해 볼 수 있다.

`$ nvm use --lts` : 최신버전을 사용하기.

여러버전의 node가 설치되어있다면, 매번 쉘을 실행 할때마다 버전을 바꿔줘야한다. 그렇기 때문에 디폴트 값을 바꿔주자!

`$ nvm alias default node` : 최신버전의 node를 디폴트로 수정. ( node자리에 버전 )

`$ which node` : node.js 설치 경로 확인하기

참고

[NVM, Node Version Manager 소개](https://dgkim5360.tistory.com/entry/node-version-manager-introduction)

[npm](https://www.npmjs.com/)

[NVM으로 쉽게하는 Node.js 버전관리](https://tutorialpost.apptilus.com/code/posts/nodejs/nvm-for-node-version-manager/)