# DOM



### 1. 제어 대상을 찾기 

---

```html
<body>
<ul>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
</ul>
<script>
    var lis = document.getElementsByTagName('li');
    for(var i=0; i < lis.length; i++){
        lis[i].style.color='red';   
    }
</script>
</body>

```

​	문서 내에서 객체를 찾아내는 방법은 여러가지가 있다. 그 중에서 하나는 getElementsBy`TagName`, `ClassName` 등을 이용하는 방법을 사용했다. 

일단 document라는 엘리먼트는 문서전체를 뜻하고, 그 문서 전체에서 li이라는 태그 네임을 갖는 모든 요소를 탐색하고, 그 li를 for문으로 돌려서 그 길이만큼(lis.length) 스타일 요소를 붙여 출력한다. 





​	만약 조회의 대상이 겹칠 때, 그 범위를 좁히고 특정 객체를 지정하려면 다른 방법이 있다. 

```html
<body>
<ul>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
</ul>
<ol>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
</ol>
<script>
    var ul = document.getElementsByTagName('ul')[0];
    var lis = ul.getElementsByTagName('li');
    for(var i=0; lis.length; i++){
        lis[i].style.color='red';   
    }
</script>
</body>
```

여기서 우리는 ul > li만을 특정하고 싶다. 그래서 겟엘리먼트태그네임을 ul로 지정하였고, 그 ul중 첫번째 배열 [0]을 통해 범위를 지정해주었다. 그 지정된 li들 중에서 아까와 똑같이 for반복문으로 스타일 요소를 붙여 실행한다. 



### getElementsByClassName을 이용하여 인자 찾기

 ```html
<body>
<ul>
    <li>HTML</li>
    <li class='active'>CSS</li>
    <li class='active'>JavaScript</li>
</ul>
<script>
    var ul = document.getElementsByClassName('active');
    var lis = ul.getElementsByTagName('li');
    for(var i=0; lis.length; i++){
        lis[i].style.color='red';   
    }
</script>
</body>
 ```



### getElementById을 이용하여 인자 찾기

```html
body>
<ul>
    <li>HTML</li>
    <li id="active">CSS</li>
    <li>JavaScript</li>
</ul>
<script>
    var li = document.getElementById('active');
    li.style.color='red';
</script>
</body>
```



### document.querySelector을 이용하여 인자 찾기

```html
<!DOCTYPE html>
<html>
<body>
<ul>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
</ul>
<ol>
    <li>HTML</li>
    <li class="active">CSS</li>
    <li>JavaScript</li>
</ol>
 
<script>
    var li = document.querySelector('li');
    li.style.color='red';
    var li = document.querySelector('.active');
    li.style.color='blue';
</script>
</body>
</html>
```



### document.querySelectorAll

```html
<body>
<ul>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
</ul>
<ol>
    <li>HTML</li>
    <li class="active">CSS</li>
    <li>JavaScript</li>
</ol>
 
<script>
    var lis = document.querySelectorAll('li');
    for(var name in lis){
        lis[name].style.color = 'blue';
    }
</script>
</body>
```

