
-- FUNCTIONS - PERFORMS A SPECIFIC TASK
-- AGGERATE FUNCTION
/*
		MATH FUNCTION
*/

SELECT COUNT(*) TOTAL_ROWS FROM EMPLOYEE;  -- CONTING THE NO OF ROWS IN TABLE

SELECT COUNT(*) no_of_HR FROM EMPLOYEE
WHERE POSITION="HR";

SELECT * FROM EMPLOYEE
WHERE POSITION="HR";

SELECT AVG(SALARY) FROM EMPLOYEE;   -- AVERAGE OF SALARIES

SELECT AVG(SALARY) FROM EMPLOYEE   -- AVERAGE OF HR SALARIES
WHERE POSITION ="HR";

SELECT SUM(SALARY) FROM EMPLOYEE   -- SUM OF HR SALARIES
WHERE POSITION ="HR";

SELECT SALARY FROM EMPLOYEE
WHERE POSITION ="HR";

SELECT MAX(SALARY) FROM EMPLOYEE;   -- MAXIMUM SALARY

SELECT MIN(SALARY) FROM EMPLOYEE;  -- MINIMUN SALARY

/*
		STRING FUNCTION
*/

SELECT UCASE(EMP_NAME)NAME,SALARY FROM EMPLOYEE; -- ALIAS NAME(we are setting the name)

SELECT LCASE(EMP_NAME),SALARY FROM EMPLOYEE;  -- DISPLAYING NAME IN LOWER CASE

SELECT EMP_NAME,CHAR_LENGTH(EMP_NAME)char_name   -- COUNTING CHAR_LENGTH OF EMP_NAME
FROM EMPLOYEE 
ORDER BY EMP_NAME;

SELECT EMP_NAME,CONCAT('RS. ',FORMAT(SALARY,0)) SALARY   -- SALARY WITH 'RS. '
FROM EMPLOYEE;                                           -- FORMAT 100,000

SELECT EMP_NAME,LEFT(POSITION,3)     -- LEFT(POSITION,3) = ADMIN->ADM
FROM EMPLOYEE;

SELECT EMP_NAME,REVERSE(EMP_NAME) REVERSE_NAME
FROM EMPLOYEE
ORDER BY EMP_NAME;

/*
	DATE FUNCTION
    
    DATE 		YYYY-MM-DD
    DATETIME 	YYYY-MM-DD HH:MI:SS
    TIMESTRAP	YYYY-MM-DD HH:MI:SS   (RANGE OF PARTICULAR TIME)
    YEAR		YYYY
    TIME		HH:MI:SS
*/

ALTER TABLE EMPLOYEE ADD COLUMN HIRE_DATE DATE;  -- ADDING COLUMN TO EMPLOYEE TABLE

SELECT * FROM EMPLOYEE;

UPDATE EMPLOYEE
SET HIRE_DATE="2002-10-24";    -- YYYY-MM-DD

UPDATE EMPLOYEE
SET HIRE_DATE="1982-12-04"
WHERE POSITION='HR';

UPDATE EMPLOYEE
SET HIRE_DATE="1980-12-04"
WHERE EMP_ID=13;

SELECT NOW();   -- IT SHOWS THE CURRENT TIME

SELECT CURDATE();

SELECT DATE(NOW());
SELECT TIME(NOW());
SELECT YEAR(NOW());

SELECT DATE_FORMAT(CURDATE(),'%D/%M/%Y');     -- YYYY-MM-DD TO 4th/june/2023

SELECT DATE_FORMAT(CURDATE(),'%d/%m/%y');     -- YYYY-MM-DD TO DD/MM/YY year will be last two digit

SELECT DATEDIFF(CURDATE(),'2020/06/04') DAYS;   -- IT SHOWS THE DIFFERNCE BW CURR DATE AND SPECIFIED DATE AND IT WILL TELL DAYS DIFFERENCE

SELECT DATE_ADD(CURDATE(),INTERVAL 10 DAY) AS 'AFTER 10 DAYS';  -- AFTER 10 DAYS

SELECT DATE_FORMAT(DATE_ADD(CURDATE(),INTERVAL 10 DAY),'%d/%m/%y') AS 'AFTER 10 DAYS';  -- AFTER 10 DAYS AND DATE FORMAT IS DD/MM/YY


USE ANAND;
SELECT CURDATE()'START DATE',
 DATE_ADD(CURDATE(),INTERVAL 1 DAY) AS 'AFTER 1 DAYS',
 DATE_ADD(CURDATE(),INTERVAL 1 WEEK) AS 'AFTER 1 WEEK',
 DATE_ADD(CURDATE(),INTERVAL 1 MONTH) AS 'AFTER 1 MONTH',
 DATE_ADD(CURDATE(),INTERVAL 1 YEAR) AS 'AFTER 1 YEAR';
 SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE "%/%"
