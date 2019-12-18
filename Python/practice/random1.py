import random

# menu 리스트를 만들어주세요.
menu = ['20층', '양자강', '김밥카페', '순남시레기', '바나프레소']
choice1 = random.choice(menu)
phone_book = { '20층' : '010-1234-1234',
'양자강' : '010-2345-2345',
'김밥카페' : '011-3456-3456',
'순남시레기' : '017-0130-0123',
'바나프레소' : '011-3561-7624'
}

print(choice1)
print(phone_book[choice1])