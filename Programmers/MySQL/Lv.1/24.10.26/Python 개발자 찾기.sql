-- https://school.programmers.co.kr/learn/courses/30/lessons/276013

-- 풀이
select ID, EMAIL, FIRST_NAME, LAST_NAME
from developer_infos
where SKILL_1 = 'Python' or SKILL_2 = 'Python' or SKILL_3 = 'Python'
order by id