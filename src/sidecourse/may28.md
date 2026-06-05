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





## Operators
select * from CUSTOMER;
-- fetch all the customers from USA, India, Italy, Japan
select * from CUSTOMER where CUSTOMER_ADDRESS in ('USA','India','Italy','Japan');

select * from ORDERS;
-- fetch all the order between customer id 200- 210
-- between
select * from ORDERS where CUSTOMER_ID between 201 AND 210;


-- find all the customers who's name starts with 'J'
-- LIKE
select * from CUSTOMER;
select * from CUSTOMER where CUSTOMER_NAME like '%a%';





## create data

-- create database
-- create database database_name;
create database student;

show databases;

use student;

show tables;

-- create table

create table Student (id int, name varchar(255), course varchar(255));

-- insert into student table
insert into Student(id, name, course) values ('101', 'Nikhil', 'Java');


select * from Student;


===== JOINS ===========

combine two or more tables to agrregate some information 
it should have a related column between them 

Constraints: 
PRIMARY key   : A column which have unique values and no null values 
UNIQUE
NOT NULL 
FOREIGN Key   : A primary key in one table, acts as foreign key in another table 
CHECK          : check condition, age = 18 
DEFAULT       :   default value for the absent data   



--------- JUNE 4 ---------------

create table
Student (id int PRIMARY KEY,
name varchar(255),
course varchar(255) NOT NULL,
email varchar(255),
phone varchar(255),
sinNumber varchar(255) UNIQUE);

insert into Student(id, name, course) values ('101', 'Nikhil', 'Java');

insert into Student (id, name, course, email, phone, sinNumber) VALUES (1, 'nikhil', 'java', 'e@mail.com', '12345678', '987654321')
insert into Student
(id,
name,
course,
email,
phone,
sinNumber)
VALUES (4,
'nikhil',
'e@mail.com',
'12345678',
'9876543')


desc Student;


-- ALTER

alter table Student
modify course varchar(255) NOT NULL;


INSERT INTO Student (id, name, course, email, phone, sinNumber)
VALUES (1, 'Alex Smith', NULL, 'alex@email.com', '555-0123', '123456789');


TASK 

1. alter the table , add column name age with Check constraint 
try to insert the  value which will fail 

age < 18




## JOINS
Inner join 


select
c.CUSTOMER_ID,
c.CUSTOMER_NAME,
o.TOTAL_AMOUNT
from CUSTOMER c
inner join ORDERS o
on c.CUSTOMER_ID = o.CUSTOMER_ID ;




left join 
right join 
Full Join 
self Join





































