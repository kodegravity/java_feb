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


-- fetch all the customers from USA or Germany

select * from CUSTOMER where CUSTOMER_ADDRESS = 'USA' OR CUSTOMER_ADDRESS = 'GERMANY';

-- fetch all the customers which are not from USA
select * from CUSTOMER where CUSTOMER_ADDRESS != 'USA';



## Sort data

-- sort all the products with decending price
select * from PRODUCT order by PRICE DESC ;

-- sort all the products with acending price
select * from PRODUCT order by PRICE ASC ;




-- functions : aggretate functions : SUM, COUNT, AVG
-- find total number of products

select count(*) from PRODUCT;


-- find the count of the product whose price is between 5k - 50K

select count(*) from PRODUCT where PRICE > 100 and PRICE < 50000;

select * from PRODUCT;

-- find the total stock [number of items ]
-- sum
select SUM(STOCK) from PRODUCT;

-- total amount of inventory ?

select SUM(PRICE) from PRODUCT;

-- Average price of the products
select AVG(PRICE) from PRODUCT;


-- price of the MAX product

select MAX(PRICE) from PRODUCT;
select MAX(SALARY) from EMPLOYEE;

-- find the max salary from the employee table 



























