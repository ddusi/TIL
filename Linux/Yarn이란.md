# YARN이란?

yarn이란 facebook에서 만든 새로운 자바스크립트 패키지 매니저.

기존에 존재하는 npm과 동일한 기능을 수행한다. 그렇다면 이 facebook은 왜 yarn을 만들었을까요??



# YARN 설치하기

### macOS 사용자

- Homebrew를 사용하여 설치한다.

  `$ brew install yarn`

- NVM같은 버전 관리 툴을 사용한다면 Node.js의 설치를 제외하고 설치!

  `$ brew install yarn --without-node`

- `$ yarn --version` 을 통해서 잘 설치되어있는지 확인하기!

### Windows 사용자

- `Chocolatey`를 사용하는 설치!

  ```
    $ choco install yarn
  ```

- `Scoop` 를 사용하는 설치

  ```
    $ scoop install yarn
  ```

- `NPM` 으로 설치

  ```
    $ npm install -g yarn
  ```

- **Path 설정해주기**

  ```
    $ export PATH="$PATH:/opt/yarn-[version]/bin"
  ```

# Yarn 사용법

> 새 프로젝트 시작하기

- 프로젝트를 시작할 때, 초기화 할때 ( `package.json` 을 생성합니다. )

  ```
    yarn init
  ```

  `package.json`파일이 없는 경우에는 대화형 인터페이스가 출력되면서 프로젝트를 설정할 수 있습니다. 이미 `package.json`이 존재하는 경우에는 해당 파일을 재사용하게 됩니다.

- 패키지를 설치하는 방법들

package.json 의존성 모듈

```
yarn
# or 
yarn install
```

의존성 모듈

```
yarn add [package]
yarn add [package]@[version]
yarn add [package]@[tag]
```

Dependencies와 같은 다른 범주 의존성

```
yarn add [package] --dev
yarn add [package] --peer
yarn add [package] --optional
```

- 패키지 업그레이드

  ```
    $ yarn upgrade [package]
    $ yarn upgrade [package]@[version]
    $ yarn upgrade [package]@[tag]
  ```

- 패키지 제거

  ```
    $ yarn remove [package]
  ```

## 그 외 Command

- global

  ```
    $ yarn global [add/ls/remove/upgrade]
  ```

  `npm`에서의 `--global` 와 비슷한 기능을 수행하는 global 이 추가된 명령어입니다.

- clean

  ```
    $ yarn clean
  ```

  이 명령어는 현재 설치된 패키지들의 의존성을 분석하여 사용하지 않는 불필요한 파일들을 제거해준다.

  이 명령어를 실행하면, `.yarnclean` 파일이 생성되며 version control에 추가해야한다.

- info

  ```
    $ yarn info [package_name] [option]
  ```

  `info` 명령어를 통해 해당 패키지의 정보를 볼 수 있습니다. option으로 readme를 입력하게 되면 해당 패키지에 작성된 README.md파일을 볼 수 있습니다.(다양한 option command가 존재합니다!)

- list

  ```
    $ yarn list [--depth]
  ```

  list 명령어를 통해 현재 작업 중인 디렉토리의 모든 패키지들의 의존성 관계를 리스트로 확인할 수 있습니다. `depth`옵션을 통해서 level을 지정할 수도 있다.

# yarn.lock

`yarn.lock`파일은 설치된 모듈의 버전을 저장해 어디서나 같은 버전과 구조의 의존성을 갖게 한다.

Yarn에서는 설치할때마다 자동으로 생성된다.

package-lock.json과 비슷한 기능을 한다고 생가각 하면 된다.

참고

[Yarn 설치 및 사용법](https://heropy.blog/2017/11/25/yarn/)

[YARN, 새로운 Package Manger](https://jaeyeophan.github.io/2017/04/21/YARN-New-Package-Manger/)

[NPM vs Yarn Cheat Sheet](https://shift.infinite.red/npm-vs-yarn-cheat-sheet-8755b092e5cc)

[yarn이란?](https://medium.com/@pakss328/yarn이란-b4e8edf1638b)