# DevOps?

## Ops ( 운영자 )

하나의 소프트웨어를 개발하기 위해서는 여러 명이 동시에 개발할 수 있는 환경도 필요하고, 수천명의 사용자를 상대로 내놓으려면 서버와 스토리지, OS 등 뒷단에서 관리해줘야 하는 인프라 환경도 갖춰야한다. 이러한 역할을 수행하는 것이 Ops의 역할이다.

## Dev ( 개발자 )

개발자(Dev)는 고객에게 제공한 변경을 빠르게 보길 원하고 운영자(Ops)는 제공하는 서비스 또는 소프트웨어의 안정성에 더 관심을 둔다. 또한, 개발자는 개발 생산성을 향상시킬 수 있는 새로운 프레임워크를 도입하고 싶어하지만 Ops는 안전성이 보장되지 않는다는 이유로 꺼린다.

## DevOps?

[Meeting Notes](https://www.notion.so/e22c8f81b584448795aaf424c3727303)

서로 다른 목적을 갖고 다른 프로세스를 다른 도구를 사용하여 개발을 진행하는 것이다. 이런 차이점 때문에 dev와 ops간의 충돌이 발생한다. 이 배경에서  등장한 것이 DevOps이다. **DevOps의 역할은 소프트웨어 상품과 서비스를 신속히 생산하는 것에 도움이 되는 임무**를 수행하게 된다. Dev와 Ops간에 그 목적을 일치시키고 프로세스와 도구에 대한 접근을 공유하여 그 차이를 줄이는데 목적이 있다.

- 아마존에서의 DevOps 모델 정의

  DevOps는 애플리케이션과 서비스를 빠른 속도로 제공할 수 있도록 조직의 역량을 향상시키는 문화 철학, 방식 및 도구의 조합입니다. 기존의 소프트웨어 개발 및 인프라 관리 프로세스를 사용하는 조직보다 제품을 더 빠르게 혁신하고 개선할 수 있습니다. 이러한 빠른 속도를 통해 조직은 고객을 더 잘 지원하고 시장에서 좀 더 효과적으로 경쟁할 수 있습니다.

- 마이크로소트에서의 DevOps 정의

  개발(Dev)과 운영(Ops)의 합성어인 DevOps는 고객에게 지속적으로 가치를 제공하도록 지원하는 사람, 프로세스 및 기술의 합집합입니다.

  팀에는 DevOps가 어떤 의미일까요? DevOps는 개발, IT 운영, 품질 엔지니어링, 보안 등 이제껏 서로 단절되었던 역할들이 서로 조율하고 협업하여 더욱 안정적이고 뛰어난 제품을 생산할 수 있도록 지원합니다. DevOps 방식과 도구를 비롯한 DevOps 문화를 도입하는 팀은 고객 요구 사항에 보다 효과적으로 대응하고, 더욱 안심하고 애플리케이션을 빌드하며, 비즈니스 목표를 더 빨리 달성할 수 있습니다.

- DevOps가 해야하는 일?

  1. SCM ( Source Code Managemnet )

     git과 같은 프로그램을 통해 지속적인 코드 관리

  2. CI / CD ( Continuous Integration )

     CI

     서비스의 품질관리를 위해서 지속적인 빌드와 테스트 과정을 지원합니다.

     CD (Continuous Deploy (or Continuous Delivery))

     빌드단계 이후의 소프트웨어의 배포를 자동화합니다. 개발자가 원할 때 언제나 즉시 테스트 혹은 프로덕션에 지속적으로 배포할 수 있다.

  3. 모니터링 및 로깅

     배포 이후 모니터링 및 로깅을 하여 제품이 최종사용자 경험에 어떤 영향을 미치는지 확인.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ac4173f-778f-487f-a5e5-b8d0f514306c/img1.daumcdn.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ac4173f-778f-487f-a5e5-b8d0f514306c/img1.daumcdn.png)

## CI ( Continuous Integration )란?

개발자가 각각 개발한 소스코드를 모아서 한꺼번에 빌드하는 과정을 특정 시점이 아니라 주기적으로 수행함으로써 통합에서 발생하는 오류를 사전에 해결하고 이러한 과정들에 소요되는 시간을 줄이기 위한 기법.

더이상 빌드는 컴파일만을 의미하지 않는다. 소프트웨어가 거대해지고 복잡해지면서 팀 단위로 개발을 하게 되었고, 그 과정에 있어서 분업과 협업이 필수가 되었다. 이 분업과 협업의 과정에서 소스 버전 관리툴을 이용한 소스코드의 Merge 과정은 까다롭게 되었고, 이 문제를 해결하기 위한 기법.

- cI 시스템 구축을 위한 핵심 구성요소

  - **CI Server**

    빌드 프로세스를 관리하는 서버로 Jenkins가 있다.

    ex)Jenkins, Travis, CI, etc

  - **SCM(Source Code Management)**

    소스코드 형상 관리 시스템으로 GIT이 여기에 속한다. 소스코드의 개정과 백업 절차를 자동화하여 오류수정 과정을 돕는다. 팀 프로젝트의 경우 각자 수정한 부분을 전체가 자동으로 동기화 할 수 있는 시스템이다.

    ex) subversion, Git etc

  - **Build Tool**

    컴파일, 테스트, 정적 분석 등을 실시해 동작가능한 소프트웨어를 생성하는 도구로 Maven이 여기에 속한다. 빌드는 형상 관리 시스템에 있는 소스코드를 가져와 컴파일하여 실행 가능한 파일로 만드는 일련의 과정을 말한다.

    ex) Maven, Gradle, Ant, make etc

  - **Test Tool**

    작성된 테스트 코드에 따라 자동으로 테스트를 수행해주는 도구로 빌드 툴의 스크립트에서 실행되며 jUnit이 여기에 해당한다.

    ex) JUnit, Mocha etc

    < 참고 >

    [[개발상식\] 23. DevOps란 무엇이며, CI는 무엇인가?](https://asfirstalways.tistory.com/303)

    [DevOps란 무엇입니까? - Amazon Web Services(AWS)](https://aws.amazon.com/ko/devops/what-is-devops/)

    [DevOps란? DevOps 알아보기 | Microsoft Azure](https://azure.microsoft.com/ko-kr/overview/what-is-devops/)

    [[개발문화탐구\] 데브옵스 (DevOps) - 소개](https://blog.sonim1.com/231)