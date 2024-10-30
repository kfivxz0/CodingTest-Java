-- https://school.programmers.co.kr/learn/courses/30/lessons/298517

-- 풀이
SELECT  ID, LENGTH
FROM  FISH_INFO
WHERE  1=1 AND LENGTH IS NOT NULL
ORDER BY  LENGTH DESC, ID ASC
LIMIT  10