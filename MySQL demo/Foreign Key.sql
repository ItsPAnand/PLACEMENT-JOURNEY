USE ANAND;

CREATE TABLE BRANCH(
BRANCH_ID INT PRIMARY KEY AUTO_INCREMENT,
BRANCH_NAME VARCHAR(15) NOT NULL,
ADDRESS VARCHAR(50),
MANAGER_ID INT
-- CONSTRAINT FK_MANAGER_ID FOREIGN KEY(MANAGER_ID) REFERENCES EMPLOYEE(EMP_ID)
);

DROP TABLE BRANCH;
DROP TABLE EMPLOYEE;

CREATE TABLE EMPLOYEE(
	EMP_ID INT PRIMARY KEY AUTO_INCREMENT,			-- the emp_id will increment next rows and no need to give manual
    EMP_NAME VARCHAR(20) NOT NULL,    				 -- NOT NULL is a constraints it will not add null
    POSITION VARCHAR(10) DEFAULT 'UNASSIGNED',  	  -- It add unassigned instead of NULL 
    SALARY INT,								
    BRANCH_ID INT,
    CONSTRAINT FK_BRANCH_ID FOREIGN KEY(BRANCH_ID) REFERENCES BRANCH(BRANCH_ID)
);

ALTER TABLE EMPLOYEE
DROP FOREIGN KEY FK_BRANCH_ID;		-- REMOVING FOREIGN KEY 

SHOW INDEX FROM EMPLOYEE; 

CREATE INDEX EMPNAME_INDEX ON EMPLOYEE(EMP_NAME);

ALTER TABLE EMPLOYEE
DROP INDEX EMPNAME_INDEX;

ALTER TABLE EMPLOYEE
ADD INDEX(EMP_NAME);