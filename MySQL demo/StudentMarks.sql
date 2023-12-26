USE ANAND;
-- SHOW TABLES;
CREATE TABLE STUDENTMARKS(
	ID INT PRIMARY KEY,
    NAME VARCHAR(50),
    CGPA DECIMAL(3,2)
);

DESCRIBE STUDENTMARKS;

ALTER TABLE STUDENTMARKS ADD COLUMN DEPARTMENT CHAR(3);  -- or ADD COLUMN
ALTER TABLE STUDENTMARKS ADD CASTE VARCHAR(10);
ALTER TABLE STUDENTMARKS DROP CASTE;

INSERT INTO STUDENTMARKS VALUES(1,"ANAND",8.51,"ECE");
INSERT INTO STUDENTMARKS VALUES(2,"SHARATH",8.69,"ECE");
INSERT INTO STUDENTMARKS VALUES(3,"BHARATH",7.8,"IT");
INSERT INTO STUDENTMARKS VALUES(4,"AKILESH R",6.5,"ECE"),(5,"SAKTHIVEL",6.3,"ECE"); -- multiple inserting in one line
INSERT INTO STUDENTMARKS(ID,NAME) VALUES(6,"VASANTH"); -- inserting only name and id

SELECT * FROM STUDENTMARKS;
SELECT ID,name FROM studentmarks; -- displaying only id and name

DROP TABLE STUDENTMARKS;