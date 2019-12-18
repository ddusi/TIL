# 다음의 주가가 89,000원이고,
# 네이버의 주가가 751,000원 일 때,
# 어떤사람이 다음주식 100주와 네이버 주식 20주를
# 가지고 있을때의 총액을 계산해주는 프로그램

daum = int(input ("당신은 Daum의 주를 얼마나 갖고 있습니까?"))
naver = int(input ("당신은 Naver의 주를 얼마나 갖고 있습니까?"))

daum_price = 89000
naver_price = 751000

total = ((daum * daum_price) + (naver * naver_price))
print (total)