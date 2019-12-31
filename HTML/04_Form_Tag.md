# Form Tag



### 1. `<form>` 태그

- 폼을 만드는 기본 태그. 

  `<form [속성="속성값"]> 폼요소 </form>`

- 사용 가능한 속성

  - method : 폼을 전송할 방식 선택
  - action : 폼을 전송할 서버 쪽의 스크립트 파일

#### `<form action="register.php" method="post">`



### 2. `<fieldset>`태그

- 폼 요소를 그룹으로 묶는 태그

 `<fieldset [속성="속성 값"]> ... </fieldset>`

​	① disabled:  태그의 자식 요소들을 사용핛 수 없게 맊든다. 

​	② form: 현재  태그가 속해 있는 form의 이름 표시 

​	③ name: 서버로 넘겨줄 이름 지정.

``` html
<fieldset>
	 <legend>로그ㅇ니 정보</legend>
	 <ul>
 		<li>아이디 : <input type="text" id="user_id"></li>
 		<li>비밀번호 : <input type="password" id="pw"></li>
	 </ul>
 </fieldset>
```







### 3. `<legend>` 태그

- 그룹으로 묶은 구역에 제목을 붙이는 태그

```html
<legend> 가입자 정보 </legend>
 <ul>
 	<li>이름 : <input type="text" id="user_name"></li>
	 <li>메일 주소 : <input type="text" id="user_mail"></li>
	 <li>생년월일 : <input type="text" id="birth"></li>
 </ul>
```





### 4. `<label>` 태그

- 폼 요소에 캡션(텍스트)을 붙이는 태그 
- 라디오 버튼이나 체크 박스에서 캡션 부분을 클릭해도 라디오 버튼과 체크 박스 버튼 이 선택된다.





### 5. `<input>`

- 사용자가 입력하는 부분은 거의  태그를 이용해 처리 

- 입력하는 내용의 종류는  태그의 type 속성을 통해 지정 

- type 속성 값에 따라 함께 사용핛 수 있는 속성들도 달라진다

  #### `<input type="유형"  [속성="속성 값"]>`



#### input의 type들 

<table>
    <tr>
    	<td>키워드</td>
        <td>설명</td>
    </tr>
    <tr>
    	<td>text</td>
        <td>한 줄짜리 텍스트를 입력할 수 있는 텍스트 상자</td>
    </tr>
     <tr>
    	<td>password</td>
        <td>비밀번호를 입력할 수 있는 필드</td>
    </tr>
    <tr>
    	<td>checkbox</td>
        <td>주어진 항목에서 2개이상 선택 가능한 체크박스</td>
    </tr>
    <tr>
    	<td>radio</td>
        <td>주어진 항모게서 1개만 선택할 수 있는 라디오버튼</td>
    </tr>
        <tr>
    	<td>hidden</td>
        <td>사용자에게는 보이지 않지만 서버로 넘겨지는 값을 가지는 필드</td>
    </tr>
        <tr>
    	<td>search</td>
        <td>검색 상자를 넣습니다.</td>
    </tr>
        <tr>
    	<td>tel</td>
        <td>전화번호 입력 필드</td>
    </tr>
        <tr>
    	<td>url</td>
        <td>url 주소를 입력할 수 있는 필드</td>
    </tr>
        <tr>
    	<td>email</td>
        <td>메일 주소를 입력 할 수 있는 필드</td>
    </tr>
        <tr>
    	<td>number</td>
        <td>숫자를 조절 할 수 있는 화살표</td>
    </tr>
        <tr>
    	<td>range</td>
        <td>숫자를 조절 할 수있는 슬라이드 막대</td>
    </tr>
        <tr>
    	<td>color</td>
        <td>색상표를 넣습니다.</td>

​    

​    


  



















