-- https://school.programmers.co.kr/learn/courses/30/lessons/298516#

-- 풀이
SELECT COUNT(*) AS FISH_COUNT 
FROM FISH_INFO 
WHERE YEAR(TIME) = '2021';