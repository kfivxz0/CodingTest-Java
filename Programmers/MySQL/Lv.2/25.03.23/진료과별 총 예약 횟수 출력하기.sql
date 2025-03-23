-- https://school.programmers.co.kr/learn/courses/30/lessons/132202

-- 문제 설명
-- 다음은 종합병원의 진료 예약정보를 담은 APPOINTMENT 테이블 입니다.
-- APPOINTMENT 테이블은 다음과 같으며 APNT_YMD, APNT_NO, PT_NO, MCDP_CD, MDDR_ID, APNT_CNCL_YN, APNT_CNCL_YMD는 각각 진료예약일시, 진료예약번호, 환자번호, 진료과코드, 의사ID, 예약취소여부, 예약취소날짜를 나타냅니다.

-- Column name	Type	Nullable
-- APNT_YMD	TIMESTAMP	FALSE
-- APNT_NO	NUMBER(5)	FALSE
-- PT_NO	VARCHAR(10)	FALSE
-- MCDP_CD	VARCHAR(6)	FALSE
-- MDDR_ID	VARCHAR(10)	FALSE
-- APNT_CNCL_YN	VARCHAR(1)	TRUE
-- APNT_CNCL_YMD	DATE	TRUE

-- 풀이
SELECT MCDP_CD AS '진료과코드', COUNT(PT_NO) AS '5월예약건수'
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY 5월예약건수, MCDP_CD