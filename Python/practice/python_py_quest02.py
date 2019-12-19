# 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

numbers = int(input('숫자를 입력하세요: '))

n = 0
while n < numbers:
    print(numbers)
    n = n + 1




'''
문제 3.
숫자를 입력 받아 짝수/홀수를 구분하는 코드를 작성하시오.
ex) python py_quest.py 실행 후 나타나는 입력란에
    2 입력시 
    짝수 출력
'''
number = int(input('숫자를 입력하세요: '))

if number % 2 == True:
    print("홀수")
else :
    print("짝수")