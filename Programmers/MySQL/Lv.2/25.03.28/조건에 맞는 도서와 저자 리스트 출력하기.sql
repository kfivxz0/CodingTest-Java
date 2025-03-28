-- https://school.programmers.co.kr/learn/courses/30/lessons/144854

-- 문제 설명
-- 다음은 어느 한 서점에서 판매중인 도서들의 도서 정보(BOOK), 저자 정보(AUTHOR) 테이블입니다.

-- BOOK 테이블은 각 도서의 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

-- Column name	Type	Nullable	Description
-- BOOK_ID	INTEGER	FALSE	도서 ID
-- CATEGORY	VARCHAR(N)	FALSE	카테고리 (경제, 인문, 소설, 생활, 기술)
-- AUTHOR_ID	INTEGER	FALSE	저자 ID
-- PRICE	INTEGER	FALSE	판매가 (원)
-- PUBLISHED_DATE	DATE	FALSE	출판일
-- AUTHOR 테이블은 도서의 저자의 정보를 담은 테이블로 아래와 같은 구조로 되어있습니다.

-- Column name	Type	Nullable	Description
-- AUTHOR_ID	INTEGER	FALSE	저자 ID
-- AUTHOR_NAME	VARCHAR(N)	FALSE	저자명

-- 풀이
SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(B.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK B
JOIN AUTHOR A ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE ASC;