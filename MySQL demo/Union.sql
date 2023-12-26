USE ANAND;

CREATE TABLE CLIENTS(
CLIENT_ID INT PRIMARY KEY AUTO_INCREMENT,
LOCATION VARCHAR(30) NOT NULL,
ADDRESS VARCHAR(30) 
);

INSERT INTO CLIENTS VALUES(1,'MUMBAI','RED LIGHT AREA');
INSERT INTO CLIENTS VALUES(2,'CHENNAI','CENTRAL');
INSERT INTO CLIENTS VALUES(3,'SALEM','NEW BUS STAND');

SELECT * FROM BRANCH;
SELECT * FROM CLIENTS;

SELECT * FROM BRANCH
UNION			-- UNION ADD TWO TABLE ONE ANOTHER ONE IN LAST AND ONLY SAME DATA TYPE IN TWO COLOUMN TABLES AND NO DUPLICATE ROWS
SELECT * FROM CLIENTS;

SELECT * FROM BRANCH
UNION ALL 			-- ALSO ADD DUPLICATE ROW
SELECT * FROM CLIENTS;

