-- https://school.programmers.co.kr/learn/courses/30/lessons/59036

-- 풀이
SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID