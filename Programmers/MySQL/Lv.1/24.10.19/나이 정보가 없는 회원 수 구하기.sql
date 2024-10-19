-- https://school.programmers.co.kr/learn/courses/30/lessons/131528

-- 풀이
SELECT COUNT(*) AS USERS 
FROM USER_INFO
WHERE AGE IS NULL;