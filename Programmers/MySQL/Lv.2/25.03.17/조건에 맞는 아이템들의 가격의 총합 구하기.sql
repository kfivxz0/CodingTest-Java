-- https://school.programmers.co.kr/learn/courses/30/lessons/273709

-- 문제 설명
-- 다음은 어느 한 게임에서 사용되는 아이템들의 아이템 정보를 담은 ITEM_INFO 테이블입니다. ITEM_INFO 테이블은 다음과 같으며, ITEM_ID, ITEM_NAME, RARITY, PRICE는 각각 아이템 ID, 아이템 명, 아이템의 희귀도, 아이템의 가격을 나타냅니다.

-- Column name	Type	Nullable
-- ITEM_ID	INTEGER	FALSE
-- ITEM_NAME	VARCHAR(N)	FALSE
-- RARITY	INTEGER	FALSE
-- PRICE	INTEGER	FALSE

-- 풀이
SELECT SUM(PRICE) AS TOTAL_PRICE
FROM ITEM_INFO
WHERE RARITY = 'LEGEND';