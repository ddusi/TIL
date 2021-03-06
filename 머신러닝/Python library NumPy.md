Python library NumPy 



NumPy는 Numerical Python의 줄임말로, 고성능 과학계산과 데이터분석의 기본 패키지이다. Numpy는 나중에 학습할 pandas, scipy, scikit-learn, tensorflow 등 고수준의 데이터분석 패키지의 기초가 된다.



NumPy가 제공하는 기능은 다음과 같다:

- 빠르고 메모리 효율적인 벡터 연산과 세련된 **브로드캐스팅** 기능을 제공하는 다차원 배열인 ndarray
- 반복문을 작성할 필요 없이 전체 데이터 배열에 대해 빠른 연산을 제공하는 표준 수학 함수
- 배열 데이터를 디스크에 쓰거나 읽을 수 있는 도구와 메모리에 올려진 파일을 사용하는 도구
- 선형대수, 난수 발생기, 푸리에 변환 기능
- C, C++, 포트란으로 쓰여진 코드를 통합하는 도구



특히 마지막 기능으로 C API를 제공하여 저수준으로 씌여진 외부 라이브러리(c로 만들어진 openCV 등)를 쉽게 사용할 수 있도록 해준다.



NumPy는 고수준의 데이터분석 기능을 제공하지 않으나,

- 데이터를 array라는 연속된 메모리 공간에 저장하고,
- array라는 메모리 블럭 단위의 연산을 사용하도록 하여,
- 큰 규모의 데이터 연산을 빠르게 수행할 수 있도록 해줄 뿐 아니라,
- deep learning 이후 각광받고 있는 GPGPU를 통한 고속 연산 처리에 바로 적용할 수 있어,
- python 계열의 데이터분석, 데이터저장, 머신러닝, AI 도구들이 공통적으로 활용하여
- 데이터 객체인 ndarray와 이 객체의 메소드를 확장하여(상속하여) 구현하고 있다.



따라서, 고수준의 여러 python 계열의 분석 도구를 활용하려면, 그 기반이 되는 NumPy를 정확하게 이해하고 있어야 제대로된 분석이 가능하다.



고수준의 여러 python 계열의 분석 도구들이 주요하게 사용하는 기능은:

- 벡터 배열상에서 데이터 개조, 정제, 부분 집합, 필터링, 변형, 다른 종류 연산의 빠른 수행
- 정렬, 유일 원소 찾기, 집합연산 같은 일반적인 배열 처리 알고리즘
- 통계의 효과적인 표현과 데이터의 수집/요약
- 다른 종류의 데이터 묶음을 병합하고 엮기 위한 데이터 정렬과 데이터 간의 관계 조작
- if-elif-else를 포함하는 반복문 대신 사용할 수 있는 조건절을 표현할 수 있는 배열 표현
- 데이터 그룹 전체에 적용할 수 있는 수집, 변형, 함수 적용 같은 데이터 처리.





numpy 불러오기 

```python
import numpy as np
```



1. array 란? 

ndarray 클래스

numpy의 핵심은 ndarray라고 하는 클래스이다. `ndarray` 클래스는 다차원 행렬 자료 구조를 지원한다. 실제로 ndarray를 사용하여 1차원 행렬(벡터)을 만들어 보자