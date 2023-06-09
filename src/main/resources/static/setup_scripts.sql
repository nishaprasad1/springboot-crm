--Oracle
CREATE TABLE CUSTOMER
(	"CUST_ID" NUMBER(6,0) NOT NULL ENABLE, 
	"CUST_FIRST_NAME" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"CUST_LAST_NAME" VARCHAR2(20 BYTE), 
	"CUST_EMAIL_ID" VARCHAR2(30 BYTE), 
	 CONSTRAINT "CUSTOMER_PK" PRIMARY KEY ("CUST_ID"));

--MySql

CREATE TABLE CUSTOMER (
    CUST_ID int NOT NULL,,
    CUST_FIRST_NAME varchar(255) NOT NULL,,
    CUST_LAST_NAME varchar(255),
    CUST_EMAIL_ID varchar(255),
	PRIMARY KEY (CUST_ID)
);

SET DEFINE OFF;
Insert into CUSTOMER (CUST_ID,CUST_FIRST_NAME,CUST_LAST_NAME,CUST_EMAIL_ID) values (1,'Chandrakesh','Yadav','cy@gmail.com');
Insert into CUSTOMER (CUST_ID,CUST_FIRST_NAME,CUST_LAST_NAME,CUST_EMAIL_ID) values (2,'Nisha','Prasad','np@gmail.com');
Insert into CUSTOMER (CUST_ID,CUST_FIRST_NAME,CUST_LAST_NAME,CUST_EMAIL_ID) values (7,'Purvik','Panchal','pp@gmail.com');
Insert into CUSTOMER (CUST_ID,CUST_FIRST_NAME,CUST_LAST_NAME,CUST_EMAIL_ID) values (3,'Durgesh','Jain','dj@jpmc.com');
Insert into CUSTOMER (CUST_ID,CUST_FIRST_NAME,CUST_LAST_NAME,CUST_EMAIL_ID) values (4,'Bansari','Vora','bv@gmail.com');
Insert into CUSTOMER (CUST_ID,CUST_FIRST_NAME,CUST_LAST_NAME,CUST_EMAIL_ID) values (6,'Tarang','Shrivastava','ts@gmail.com');
