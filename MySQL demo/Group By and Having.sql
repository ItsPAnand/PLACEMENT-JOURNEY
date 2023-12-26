USE ANAND;

SELECT * FROM EMPLOYEE
ORDER BY POSITION;

SELECT POSITION,AVG(SALARY)
FROM EMPLOYEE
GROUP BY POSITION;           -- AVERAGE SALARY OF INDIVIDUAL POSITION

SELECT POSITION,COUNT(EMP_ID)
FROM EMPLOYEE
GROUP BY POSITION;                 -- COUNTING THE NO OF POSITION

SELECT POSITION,COUNT(EMP_ID)
FROM EMPLOYEE
GROUP BY POSITION
HAVING COUNT(EMP_ID)>1;    -- COUNTING THE NO OF POSITION WHICH IS GREATER THAN 1

-- WHERE FILTERS THE ROWS
-- HAVING FILTER THE GROUPS

SELECT * FROM EMPLOYEE;

SELECT POSITION,COUNT(EMP_ID)
FROM EMPLOYEE
WHERE SALARY>150000
GROUP BY POSITION
HAVING COUNT(EMP_ID)>1 
ORDER BY COUNT(EMP_ID); 

SELECT POSITION,COUNT(EMP_ID)
FROM EMPLOYEE
GROUP BY POSITION
HAVING COUNT(EMP_ID)>1 
ORDER BY COUNT(EMP_ID);