-- https://school.programmers.co.kr/learn/courses/30/lessons/144853

-- 풀이
SELECT BOOK_ID, date_format(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE CATEGORY ='인문' AND YEAR(PUBLISHED_DATE) = 2021
ORDER BY PUBLISHED_DATE