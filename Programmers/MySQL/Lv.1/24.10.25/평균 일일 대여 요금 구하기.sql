-- https://school.programmers.co.kr/learn/courses/30/lessons/151136

-- 풀이
SELECT  ROUND(AVG(DAILY_FEE),0) AS AVERAGE_FEE
FROM  CAR_RENTAL_COMPANY_CAR 
WHERE  CAR_TYPE = "SUV"