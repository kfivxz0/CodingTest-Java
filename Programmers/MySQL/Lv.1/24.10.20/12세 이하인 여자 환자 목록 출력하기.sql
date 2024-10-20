-- https://school.programmers.co.kr/learn/courses/30/lessons/132201

-- 풀이
SELECT PT_NAME,	PT_NO,	GEND_CD,AGE,ifnull(TLNO,'NONE') as TLNO
from PATIENT
where (AGE<=12) and (GEND_CD='W')
order by AGE DESC, PT_NAME