SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, NVL(FREEZER_YN, 'N')
FROM FOOD_WAREHOUSE
WHERE SUBSTR(ADDRESS, 1, 3) = '경기도'
ORDER BY WAREHOUSE_ID ASC;