-- https://school.programmers.co.kr/learn/courses/30/lessons/133026

-- 문제 설명
-- 다음은 아이스크림 가게의 상반기 주문 정보를 담은 FIRST_HALF 테이블과 아이스크림 성분에 대한 정보를 담은 ICECREAM_INFO 테이블입니다. FIRST_HALF 테이블 구조는 다음과 같으며, SHIPMENT_ID, FLAVOR, TOTAL_ORDER 는 각각 아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량을 나타냅니다. FIRST_HALF 테이블의 기본 키는 FLAVOR입니다.

-- NAME	TYPE	NULLABLE
-- SHIPMENT_ID	INT(N)	FALSE
-- FLAVOR	VARCHAR(N)	FALSE
-- TOTAL_ORDER	INT(N)	FALSE
-- ICECREAM_INFO 테이블 구조는 다음과 같으며, FLAVOR, INGREDITENT_TYPE 은 각각 아이스크림 맛, 아이스크림의 성분 타입을 나타냅니다. INGREDIENT_TYPE에는 아이스크림의 주 성분이 설탕이면 sugar_based라고 입력되고, 아이스크림의 주 성분이 과일이면 fruit_based라고 입력됩니다. ICECREAM_INFO의 기본 키는 FLAVOR입니다. ICECREAM_INFO테이블의 FLAVOR는 FIRST_HALF 테이블의 FLAVOR의 외래 키입니다.

-- NAME	TYPE	NULLABLE
-- FLAVOR	VARCHAR(N)	FALSE
-- INGREDIENT_TYPE	VARCHAR(N)	FALSE

-- 풀이
SELECT
    II.INGREDIENT_TYPE,
    SUM(FH.TOTAL_ORDER) TOTAL_ORDER
FROM FIRST_HALF FH
JOIN ICECREAM_INFO II
ON FH.FLAVOR = II.FLAVOR
GROUP BY II.INGREDIENT_TYPE
ORDER BY FH.TOTAL_ORDER;