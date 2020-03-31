-- 제약조건 명칭 조회.

-- 제약조건 삭제.

-- 제약조건 입력
SELECT *  FROM TABLE_CONSTRAINTS
--EMP_IBFK_1 제약조건 명칭.
ALTER TABLE EMP DROP FOREIGN KEY EMP_IBFK_1;

ALTER TABLE EMP ADD 
	CONSTRAINT FK_EMP_DEPT
	FOREIGN KEY (DEPTNO) REFERENCES 사원(DEPTNO)
	ON DELETE CASCADE;
	
	
SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
WHERE TABLE_NAME = '사원';


SELECT 고객아이디, 고객이름, 나이, 등급, 직업, 적립금
FROM 고객;

SELECT *
FROM 고객;

DESC 고객;

SELECT DISTINCT 제조업체, 제품명
FROM 제품;

SELECT 제품명, 단가 AS '가격' 
FROM 제품;

SELECT 제품명, 단가, 단가+500 AS 조정단가 FROM 제품;


SELECT 제조업체,  제품명, 재고량, 단가
FROM 제품
WHERE 제조업체 = '한빛제과';

SELECT * FROM 주문
	WHERE 수량 >= 30 AND 배송지 = '강원도 춘천시';

-- 연습문제 3-5번.
--1 번.
SELECT ENAME, JOB FROM EMP
	WHERE MGR = 7839

--2번.
SELECT JOB, DEPTNO FROM EMP
	WHERE SAL = 3000;
	
--3번
SELECT ENAME, JOB, SAL FROM EMP
	WHERE JOB != 'CLERK' AND JOB != 'SALESMAN';

--4번.
SELECT SAL, DEPTNO FROM EMP
	WHERE MGR = 7839 OR JOB = 'ANALYST'

--5번.
SELECT * FROM EMP
	WHERE (MGR = 7698 OR MGR = 7839) AND DEPTNO = 10;
	
--4-1
SELECT SAL * 1.1
	, SAL * 12 + COMM
	, SAL * 12 + IFNULL(COMM, 0)
	 FROM EMP;
	 
	 
SELECT * FROM 고객
	WHERE 직업 LIKE '___' AND 
			고객아이디 LIKE '%a%';
			

-- 연습문제 3-6
--1번
SELECT ENAME, JOB FROM EMP
	WHERE ENAME LIKE 'a%';

--2번
SELECT ENAME, JOB FROM EMP
	WHERE ENAME LIKE '%N';
	
--3번
SELECT ENAME, DEPTNO FROM EMP
	WHERE ENAME LIKE '____' AND ENAME LIKE '__R%';
-- 또는 ENAME LIKE '__R_'으로도 가능.

--4번
SELECT ENAME, JOB FROM EMP
	WHERE ENAME LIKE '_I%';
	
-- 연습문제 3-7
SELECT * FROM EMP
--1번
SELECT ENAME, JOB, SAL FROM EMP
	WHERE MGR IS NULL;
	
--2번
SELECT ENAME, HIREDATE, SAL FROM EMP
	WHERE COMM IS NULL;
	
--3번
SELECT * FROM EMP
	WHERE MGR IS NOT NULL AND DEPTNO = 20

--4번
SELECT  FROM EMP
	WHERE MGR IS NOT NULL AND DEPTNO = 20


-- 연습문제 3-8
--1번
SELECT * FROM EMP
	ORDER BY ENAME DESC;
--2번
SELECT * FROM EMP
	ORDER BY HIREDATE;	
--3번
SELECT * FROM EMP
	ORDER BY DEPTNO DESC, ENAME ASC;
--4번
SELECT * FROM EMP
	ORDER BY SAL DESC;


--교재에는 없는 내용인 LIMIT 
SELECT * FROM EMP
	LIMIT 0, 5; -- INDEX 0번 부터 ~5개
	
-- 30번 부서에 근무하는 사람들을 급여가 높은 순으로 
-- 정렬하여 5건씩 출력하는 문장 만들기

SELECT * FROM EMP
	WHERE DEPTNO = 30
	ORDER BY SAL DESC
	LIMIT 0, 5;

-- 3-9 연습문제
--1) 부서번호가 10번인 부서의 사람 중 사원번호, 이름, 월급을 출력
--2) 사원번호가 7369인 사람 중 이름, 입사일, 부서번호를 출력
--3) 이름이 ALLEN인 사람의 모든 정보를 출력
--4) 직업이 MANAGER가 아닌 사람의 모든 정보를 출력
--5) 급여가 $800 이상인 사람의 이름, 급여, 부서번호를 출력
--6) 부서번호가 20번 이상인 사원의 모든 정보를 출력
--7) 이름이 K 보다 높은 이름을 가진 사람의 모든 정보를 출력

--1번
SELECT EMPNO, ENAME, SAL FROM EMP
	WHERE DEPTNO = 10;
	
--2번
SELECT ENAME, HIREDATE, DEPTNO FROM EMP
	WHERE EMPNO = 7369;

--3번
SELECT * FROM EMP
	WHERE ENAME = 'ALLEN';
	
--4번
SELECT * FROM EMP
	WHERE JOB !='MANAGER';

--5번
SELECT ENAME, SAL, DEPTNO FROM EMP
	WHERE SAL >= 800;
	
--6번
SELECT * FROM EMP
	WHERE DEPTNO >= 20;

--7번
SELECT * FROM EMP
	WHERE ENAME > 'K';
	

	
	
	
	
