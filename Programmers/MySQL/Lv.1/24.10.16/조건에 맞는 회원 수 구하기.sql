-- https://school.programmers.co.kr/learn/courses/30/lessons/131535

-- 풀이
SELECT COUNT(*) AS USERS
FROM USER_INFO
WHERE AGE >= 20 AND AGE <= 29 AND YEAR(JOINED) = 2021
