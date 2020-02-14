Mobile jQuery



모바일 웹 페이지를 만들때 아주 편리함. 유동적으로 변동되기 때문에 주의해야한다. 



기존 jQuery = PC

jQuery Mobile = 모바일 디바이스 



jquery mobile은 html5의 커스텀 테이터 속성을 사용한다. 

data-role은 page, header, content, footer 등의 값을 jquery mobile에서 인식합니다.



- jquery mobile은 한 파일 안에 여러 페이지를 나누어 작성 가능하고 이들을 이동시킬 수 있기 때문에 앱과 비슷한 모양을 가추어 부드럽게 처리할 수 있습니다.

  또한 네이게이션을 자동으로 관리하여 뒤로가기버튼이나 딥링크도 제공됩니다

- 반면에 한번에 여러페이지가 있는 파일을 내려받기 때문에 큰 파일일수록 처음 내려받는 시간이 길어집니다. 하지만 내려받기만 한다면 그 다음에는 네트워크 속도와 상관없이 빠르게 동작합니다.

- 여기서 주의할 점은 외부 페이지를 불러오더라도 index.html 에 보이지 않은 page2, page2, page3이 있다고 했습니다.

  그렇기 때문에 외부 페이지와 현재 페이지의 페이지 아이디가 겹치지 않도록 주의해야 합니다.

  

  ```html
  <a href="externalPage.html" data-prefetch="true">go external page</a>
  
  <p><a href="externalPage.html" data-ajax="false">go external page</a></p>
  
  <!-- data-ajax="false" 를 넣으면 바로 비동기식으로 페이지를 모두 불러와놓는다. -->
  
  ```

  





jquery mobile은 비동기 방식이므로 페이지를 로딩하는 이벤트와 로딩하기 전 후 이벤트를 구별합니다. jquery에서는 보통 ready 메소드를 사용하여 jquery(doucument).read(); 또는 약식으로 $(function(){}); 으로 사용하기도 합니다.



**pagebeforehide**

a 페이지에서 b 페이지로 이동하기 전에 a 페이지에서 발생하는 이벤트 입니다. ui.nextPage는 이동할 페이지 b 이며 b가 없을 경우에는 빈 jquery 객체입니다.

 

**pagebeforeshow**

a 페이지에서 b 페이지로 이동하기 전에 b 페이지에서 발생하는 이벤트 입니다. ui.prevPage는 이동 시작 페이지 a 이며 a가 없을 경우에는 빈 jquery 객체입니다.

 

**pagehide**

전환 시작 페이지 a 에서 전환이 끝난 후 발생합니다. ui.nextPage는 전환대상 페이지의 jquery 객체이며 전환 대상 페지이가 없을 경우는 빈 객체입니다.

 

**pageshow**

전환 대상 페이지 b 에서 전환이 끝난 후 발생합니다. ui.prevPage는 전환 시작 페이지의 jquery 객체이며 전환 시작 페이지가 없을 경우는 빈 객체입니다.





pageEvent.html

```html
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>jquery mobile</title>
 
<link rel="stylesheet" href="./jqueryMobile/jquery.mobile-1.4.5.css">
<script src="./jquery/jquery-1.11.0.js"></script>
<script src="./jqueryMobile/jquery.mobile-1.4.5.js"></script>
<script type="text/javascript">
$(function(){
    $("#page1").bind("pagebeforehide",function(event, ui){
        alert("1페이지에서 2페이지로 전환 전에 1페이지에서 작동합니다.");
    });
    
    $("#page2").bind("pagebeforeshow",function(event, ui){
        alert("1페이지에서 2페이지로 전환 전에 2페이지에서 작동합니다.");
    });
    
    $("#page1").bind("pagehide",function(event, ui){
        alert("1페이지에서 2페이지로 전환이 끝난 후에 1페이지에서 작동합니다.");
    });
    
    $("#page2").bind("pageshow",function(event, ui){
        alert("1페이지에서 2페이지로 전환이 끝난 후에 2페이지에서 작동합니다.");
    });
    
    ///////////////////////////////////////////////////////////////////////////
    
    $("#page2").bind("pagebeforehide",function(event, ui){
        alert("2페이지에서 1페이지로 전환 전에 2페이지에서 작동합니다.");
    });
    
    $("#page1").bind("pagebeforeshow",function(event, ui){
        alert("2페이지에서 1페이지로 전환 전에 1페이지에서 작동합니다.");
    });
    
    $("#page2").bind("pagehide",function(event, ui){
        alert("2페이지에서 1페이지로 전환이 끝난 후에 2페이지에서 작동합니다.");
    });
    
    $("#page1").bind("pageshow",function(event, ui){
        alert("2페이지에서 1페이지로 전환이 끝난 후에 1페이지에서 작동합니다.");
    });
    
    ///////////////////////////////////////////////////////////////////////////
 
});
</script>
</head>
<body>
 
<!---------------------- section 별로 페이지 나눔 --------------------------->
<section id="page1" data-role="page">
    <header data-role="header"><h1>jQuery Mobile</h1></header>                   
    <div class="content" data-role="content">
        <p>1 page</p>
        <p><a href="#page2">go page2</a></p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
    
 
<!---------------------- section 별로 페이지 나눔 --------------------------->
<section id="page2" data-role="page">
    <header data-role="header" data-add-back-btn="true"><h1>jQuery Mobile</h1></header>
    <div class="content" data-role="content">
        <p>2 page</p>
        <p><a href="#page1">go page1</a></p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
 
</body>
</html>


출처: https://cofs.tistory.com/153?category=637492 [CofS]
```











**대화상자 ( 다이얼로그 팝업 ) 은 modal 대화상자로서 해스토리 해쉬에는 저장되지 않습니다.**

**그러므로 다이얼로그에서 다른 페이지로 이동 후 뒤로가기를 실행해도 다이얼로그로 돌아가지 않습니다.**



dialog.html

```
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>jquery mobile</title>
 
<link rel="stylesheet" href="./jqueryMobile/jquery.mobile-1.4.5/jquery.mobile-1.4.5.css">
<script src="./jquery/jquery-1.11.0.js"></script>
<script src="./jqueryMobile/jquery.mobile-1.4.5/jquery.mobile-1.4.5.js"></script>
 
</head>
<body>
 
 
<section id="page1" data-role="page">
    <header data-role="header"><h1>jQuery Mobile</h1></header>                   
    <div class="content" data-role="content">
        <p>1 page</p>
        <p><a href="#page2" data-rel="dialog">go page2</a></p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
 
 
<section id="page2" data-role="page">
    <header data-role="header" data-add-back-btn="true"><h1>jQuery Mobile</h1></header>
    <div class="content" data-role="content">
        <p>2 page</p>
        <p><a href="#page3">go page3</a></p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
 
 
<section id="page3" data-role="page">
    <header data-role="header" data-add-back-btn="true"><h1>jQuery Mobile</h1></header>
    <div class="content" data-role="content">
        <p>3 page</p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
 
</body>
</html>



```







jquery mobile은 페이지 url을 자동으로 관리합니다.

사용자가 링크 또는 버튼으로 페이지를 이동할때마다 jquery mobile은 location.hash 객체를 갱신하여 히스토리 해시에 이동 정보를 저장합니다.

 

대화상자 ( 다이얼로그 팝업, dialog ) 는 modal 이므로 히스토리 해시에 저장되지 않습니다.

 

페이지 사이를 정확하게 직접 이동하려면 changePage() 메소드를 사용하여야 합니다.

페이지를 이동하기 전에 어떤 처리를 해야한다거나 할 때 직접 호출하여 사용할 수 있습니다.



옵션에는 배열로 들어갑니다.

 

여러 옵션이 있지만 그 중에서 중요한 것 몇가지만 짚고 넘어갑니다.

**changeHash** : boolean 타입으로 히스토리 해시에 저장할지를 결정합니다. 기본값은 true 이고 false로 입력 시 뒤로가기 버튼이 동작하지 않습니다.

**data** : 전송 시 넘겨줄 데이터를 입력합니다 (Json)

**reverse** : boolean 타입으로 페이지를 표시할 때 어떤 방향으로 불러올지를 결정합니다.

**type** : 페이시 전송 타입을 설정합니다 post 또는 get

**transition** : 화면 전환 에니메이션을 설정합니다.

( fade | flip | flow | pop | slide | slidedown | slidefade | slideup | turn | none )

 



005changePage.html

```html
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jquery mobile</title>
 
<link rel="stylesheet" href="./jqueryMobile/jquery.mobile-1.4.5.css">
<script src="./jquery/jquery-1.11.0.js"></script>
<script src="./jqueryMobile/jquery.mobile-1.4.5.js"></script>
</head>
<script type="text/javascript">
$(function(){
    $("#goChangPage2Btn").bind("click",function(){
        alert("005changePage2.html 페이지로 이동합니다." );
        $.mobile.changePage( "005changePage2.html", {transition: "flip", changeHash: false });
    });
    
    $("#backBtn").bind("click",function(){
        $.mobile.changePage( "#page1", { transition: "flip", changeHash: false });
    });
});
</script>
<body>
 
<section id="page1" data-role="page">
    <header data-role="header"><h1>jQuery Mobile</h1></header>                   
    <div class="content" data-role="content">
        <p>1 page</p>
        <p><a href="#page2" >go page2</a></p>
        <p><button id="goChangPage2Btn">go 005changePage2.html</button></p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
 
    
    
    
<section id="page2" data-role="page">
    <header data-role="header" data-add-back-btn="true"><h1>jQuery Mobile</h1></header>                   
    <div class="content" data-role="content">
        <p>2 page</p>
        <p><button id="backBtn">뒤로가기</button></p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
 
 
</body>
</html>

```





005changePage2.html

```html
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jquery mobile</title>
 
<link rel="stylesheet" href="./jqueryMobile/jquery.mobile-1.4.5.css">
<script src="./jquery/jquery-1.11.0.js"></script>
<script src="./jqueryMobile/jquery.mobile-1.4.5.js"></script>
</head>
<body>
 
 
<section id="page3" data-role="page">
<script type="text/javascript">
$(function(){
    $("#backBtn1").on("click",function(){
        $.mobile.changePage( "005changePage.html", { transition: "slideup", changeHash: false, reverse :false });
    });
});
</script>
    <header data-role="header" data-add-back-btn="true"><h1>jQuery Mobile</h1></header>
    <div class="content" data-role="content">
        <p>3 page</p>
        <p><a href="#page4" >go page4</a></p>
        <p><button id="backBtn1">뒤로가기</button></p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
    
 
    
<section id="page4" data-role="page">
    <header data-role="header" data-add-back-btn="true"><h1>jQuery Mobile</h1></header>
    <div class="content" data-role="content">
        <p>4 page</p>
    </div>
    <footer data-role="footer"><h1>cofs</h1></footer>
</section>
 
 
</body>
</html>


```











