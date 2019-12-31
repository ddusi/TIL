# CSS 속성



### 1. 단위

​	CSS에서 주로 사용하는 단위

- `px` : 절대적 속성 크기, 모니터 해상도 기준 화소

  font-size : 20px;

  

- `pt` : 절대적 속성 크기, 1pt - 1/72in

  font-size : 20pt;

  

- `em` : 상대적 속성 크기, 부모 요소 글자 크기의 배수

  font-size : 20em;





### 2. display

> HTML 요소를 화면에 출려 또는 숨기는 스타일 속성

<table>
    <tr>
        <td>속성</td>
        <td>설명</td>
        <td>사용법</td>
    </tr>
    <tr>
        <td>none</td>
        <td>숨김</td>
        <td>display:none;</td>
    </tr>
    <tr>
        <td>block</td>
        <td>한줄 공간 출력</td>
        <td>display:block;</td>
    </tr>
    <tr>
        <td>inline</td>
        <td>내용만큼만 공간 출력</td>
        <td>display:inline;</td>
    </tr>
    <tr>
        <td>inline-block</td>
        <td>내용만큼만 공간 출력 & 여러가지 속성</td>
        <td>display:inline-block</td>
    </tr>
</table>





### 3. visibility

> HTML 요소를 화면에 출력 또는 숨기는 스타일 속성

- ##### `visibility : visible;`  - 출력

- ##### `visibility : hidden;` - 숨김



###### display와 차이점

​	display:none; - HTML 요소를 화면에서 숨기며, 공간을 차지하지 않음

​	visibility:hidden - HTML 요소를 화면에서 숨기며, 공간은 유지





#### 4. Opacity

> HTML 요소의 투명도 조절
>
> 0.0~1.0까지 조절

##### `opacity:1.0;`

