-- https://school.programmers.co.kr/learn/courses/30/lessons/59041

-- 풀이
SELECT NAME, COUNT(NAME) AS 'COUNT' 
FROM ANIMAL_INS 
GROUP BY NAME 
HAVING COUNT(NAME) > 1 
ORDER BY NAME