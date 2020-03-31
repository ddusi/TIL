C - Create

R - Read

U - Update

D - Delet



ID가 2 이상 부터 입력되는 현상 수정

application.properties

```properties
# auto increment
spring.jpa.hibernate.use-new-id-generator-mappings=false
```



테이블을 새로 만들고 싶을때

application.properties

```properties
# jpa
spring.jpa.hibernate.ddl-auto=update
```



종료

```
		<script>
			$("#write").click(function() {
				location = "/board/write";
				return false;	// 여기서 종료
			});
		</script>
```





게시판 정렬

BoardController.java

내림차순 (ASC)

```java
	@GetMapping("/board")
	public String board(Model model) {
		List<Board> list = boardRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
		model.addAttribute("list", list);
		return "board/list";
```



오름차순 (DESC)

```JAVA
@GetMapping("/board")
	public String board(Model model) {
		List<Board> list = boardRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
		model.addAttribute("list", list);
		return "board/list";
	}
```



게시판 조회 상세내용

templates/board.list.html

```html
 <script>
 $("#write").click(function() {
 	location = "/board/write";
 	return false;
 });
$("tr").click(function() {
	var id = $(this).attr("id");
	location = "/board/" + id;  //고유 id값만 찾아서 URL에 적용
	return false;
});
 </script>
```



수행평가 (실기)

Java

- scanner를 이용한 입력
- 입력된 자료를 클래스로 저장



HTML/CSS/JS/Jquery

- 자바 요구 조건과 동일
- 입력 UI만들기



Spring boot

- RestTemplate
- JSON Parsing
- 

