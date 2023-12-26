USE ANAND;

DROP TABLE EMPLOYEE;
DROP TABLE BRANCH;

CREATE TABLE BRANCH(
BRANCH_ID INT PRIMARY KEY AUTO_INCREMENT,
BRANCH_NAME VARCHAR(15) NOT NULL,
ADDRESS VARCHAR(50)
);

CREATE TABLE EMPLOYEE(
	EMP_ID INT PRIMARY KEY AUTO_INCREMENT,			
    EMP_NAME VARCHAR(20) NOT NULL,    				
    POSITION VARCHAR(10) DEFAULT 'UNASSIGNED',  	  
    SALARY INT,								
    BRANCH_ID INT,
    CONSTRAINT FK_BRANCH_ID FOREIGN KEY(BRANCH_ID) REFERENCES BRANCH(BRANCH_ID)
);

INSERT INTO BRANCH VALUES(1,'CHENNAI','CHENNAI BUS STAND');
INSERT INTO BRANCH VALUES(2,'MUMBAI','MUMBAI BUS STAND');
INSERT INTO BRANCH VALUES(3,'BANGALORE','BANGALORE BUS STAND');

INSERT INTO EMPLOYEE VALUES(1,"ANAND",'ADMIN',275000,3);
INSERT INTO EMPLOYEE VALUES(2,"SHARATH",'MANAGER',200000,3);
INSERT INTO EMPLOYEE VALUES(3,"AKILESH",'SALES',100000,2);
INSERT INTO EMPLOYEE VALUES(4,"BHARATH",'SALES',100000,2);
INSERT INTO EMPLOYEE VALUES(5,"SAKTHIVEL",'HR',250000,1);
INSERT INTO EMPLOYEE VALUES(6,"VASANTH",'HR',250000,3);
INSERT INTO EMPLOYEE VALUES(7,"HEMALATHA",'CEO',300000,3);
INSERT INTO EMPLOYEE VALUES(8,"VARSHA",'MANAGER',200000,1);
INSERT INTO EMPLOYEE VALUES(9,"SRI HARINI",'MANAGER',200000,2);
INSERT INTO EMPLOYEE VALUES(10,"KARTHIKA",'HR',250000,1);
INSERT INTO EMPLOYEE VALUES(11,"POOJA",'HR',250000,3);
INSERT INTO EMPLOYEE VALUES(12,"VIMAL MARIA RAJ",'ENGINEER',100000,1);
INSERT INTO EMPLOYEE VALUES(13,"ROBO",'ENGINEER',100000,NULL);
INSERT INTO EMPLOYEE VALUES(14,"JANANI",'ENGINEER',100000,NULL);

SELECT *FROM EMPLOYEE;
SELECT * FROM BRANCH;

SELECT E.EMP_ID,E.EMP_NAME,E.POSITION,E.SALARY,B.BRANCH_NAME
FROM EMPLOYEE AS E
INNER JOIN BRANCH AS B			-- INNER JOIN WILL GIVE THE PERFECT MATCH BASED ON THE CONDITION
ON E.BRANCH_ID=B.BRANCH_ID
ORDER BY E.EMP_ID;  -- OR EMP_ID;

SELECT EMPLOYEE.EMP_ID,employee.EMP_NAME,EMPLOYEE.POSITION,EMPLOYEE.SALARY,BRANCH.BRANCH_NAME
FROM EMPLOYEE
LEFT JOIN BRANCH				-- IT WILL SHOW THE REMAINING VALUE IN LAST ROW IN THE LEFT TABLE WHICH ARE NOT SATISFIED BY THE GIVEN CONDITION 
ON EMPLOYEE.BRANCH_ID=BRANCH.BRANCH_ID
ORDER BY EMPLOYEE.EMP_ID;
-- RIGHT JOIN IS ALSO LIKE LEFT JOIN IT WILL SHOW THE REMAINING VALUE IN LAST ROW IN THE RIGHT TABLE WHICH ARE NOT SATISFIED BY THE GIVEN CONDITION 

SELECT EMPLOYEE.EMP_ID,employee.EMP_NAME,EMPLOYEE.POSITION,EMPLOYEE.SALARY,BRANCH.BRANCH_NAME
FROM EMPLOYEE,BRANCH
WHERE EMPLOYEE.BRANCH_ID=BRANCH.BRANCH_ID;			-- USING WHERE 

SELECT EMPLOYEE.EMP_ID,employee.EMP_NAME,EMPLOYEE.POSITION,EMPLOYEE.SALARY,BRANCH.BRANCH_NAME
FROM EMPLOYEE
CROSS JOIN BRANCH;			-- CROSS JOIN CONNECT TAKE ONE ROW AND CONNECT TO ALL OTHERE ROW

-- BRANCH NAME ,EEMPOYEE COUNT AS OUTPUT
SELECT B.BRANCH_NAME,COUNT(E.EMP_ID) NO_OF_EMPLOYEE
FROM BRANCH AS B
JOIN EMPLOYEE AS E
ON B.BRANCH_ID=E.BRANCH_ID
GROUP BY E.BRANCH_ID;