import requests
from bs4 import BeautifulSoup

url = "https://finance.naver.com/sise/"

# request = requests.get(url)
request = requests.get(url).text
# print(request)
soup = BeautifulSoup(request, 'html.parser') #html을 사용 할 수 있게 컴파일해줘.
# print(soup)

kospi = soup.select_one ("#KOSPI_now")
print(kospi.text)