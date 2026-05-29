## Recap 

Mysql instance 

database : 
SQL  : MySQL, Postgres, MS SQL server, Oracle 
vs 
noSQL[mongoDB, Redis[caching], DynamoDB] 


Mysql  - database  
and 
SQL - Structured Query Language

CRUD - GETMAPING, POSTMAPING
Create 
Update
delete 
read GETMAPING

                        Business Logic        Database related code
API[Controller] ------> service Layer -----> Repository [find]-------->       Database 



## Database

database
 |
Schema
    |
    Tables
        Rows and Columns


## Queries 

show databases;

use kode;

show tables; -- Customer Product Orders Order_items

-- list all teh products
select * from PRODUCT;

-- list only PRODUCT_ID and PRODUCT_NAME
select PRODUCT_ID, PRODUCT_NAME from PRODUCT;


-- fetch all the products whose price is more than 20K
select * from PRODUCT where PRICE > 2000;


-- fetch all the products whose category id is 1
select * from PRODUCT where CATEGORY_ID = 1;

-- fetch all productName whose price is between 20K and 60K
select * from PRODUCT where PRICE > 20000 and PRICE < 60000;


select * from CUSTOMER;

-- find all the customers from USA
select * from CUSTOMER where CUSTOMER_ADDRESS = 'UK';
























