-- https://school.programmers.co.kr/learn/courses/30/lessons/293258

-- 풀이
SELECT COUNT(ID) AS FISH_COUNT
FROM FISH_INFO
WHERE LENGTH IS NULL;