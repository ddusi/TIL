## for문 



1. #### for문의 기본 구조

   ```python
   for [변수] in [자료형]: # String, List, Tuple, Dictionary, Set
    수행할 문장
    수행할 문장
    수행할 문장
   ```

   > 첫번째 요소부터 마지막 요소까지 차례로 변수에 대입되어 반복 실행

   

2.  #### 두 개 이상의 변수 사용

   - List [Tuple, Tulpe, ...]

     ```python
     data = [ (1, 2), (3, 4), (5, 6) ]
     for a, b in data:
      print(a, b)
     ```

     List[List, List, ...]

     ```python
     data = [ [1, 2, 'a'], [3, 4, 'b'], [5, 6, 'c'] ]
     for a, b, c in data:
      print(a, b, c)
     ```

     List[Set, Set, ...]

     ```python
     data = [ {1, 2, 'a'}, {3, 4, 'b'}, {5, 6, 'c'} ]
     for a, b, c in data:
      print(a, b, c)
     ```

   

   

   - Tuple[ List, List, ...]

     ```python
     data = ( [1, 2, 'a'], [3, 4, 'b'], [5, 6, 'c'] )
     for a, b, c in data:
      print(a, b, c)
     ```

     List [Dictionary, Dictionary, ...]

     ```python
     data = [ {'a' : 1, 'b' : 2}, {'c' : 3, 'd' : 4} ]
     for a, b in data:
      print(a, b)
     ```



3. #### 반복문 활용 

   - 점수 합계 구하기

     ```python
     score = [ 90, 88, 54, 70, 66 ]
     total = 0
     for s in score:
      total += s
     print('합계', total, '점')
     ```

      

   - 점수 평균 구하기

     ```python
     score = [ 90, 88, 54, 70, 66 ]
     total = 0
     count = 0
     for s in score:
      count += 1
      total += s
     average = total / count
     print('평균', average, '점')
     ```

     

   - break (5개 과목 중 60점 미만의 점수가 있으면 반복문 종료)

     ```python
     score = [ 90, 88, 54, 70, 66 ]
     for s in score:
      if s < 60:
      print('60점 미만 반복문 종료')
      break
     ```

   - continue (5개 과목 중 60점 이상으로 합격된 점수만 출력)

     ```python
     score = [ 90, 88, 54, 70, 66 ]
     for s in score:
      if s < 60:
      continue
     
      print('합격', s, '점')
     ```

     

