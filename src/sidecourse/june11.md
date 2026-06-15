## 

grpc - Google remote procedural call

client ------> http -----> service 1  ----> grpc ----> service 3



## recap 

contraints 
Joins --- -> 


### LEFT join 

A                   B 


everything from the left table and matching rows from the right table 


show databases;

use kode;

show tables;

-- JOINS
-- Inner join


select
c.CUSTOMER_ID,
c.CUSTOMER_NAME,
o.TOTAL_AMOUNT
from CUSTOMER c
inner join ORDERS o
on c.CUSTOMER_ID = o.CUSTOMER_ID ;


select * from CUSTOMER c ;
select * from ORDERS o ;



-- Left Join
select
c.CUSTOMER_ID,
c.CUSTOMER_NAME,
o.TOTAL_AMOUNT
from CUSTOMER c
right join ORDERS o
on c.CUSTOMER_ID = o.CUSTOMER_ID ;

SHOW COLUMNS FROM CUSTOMER;

insert into CUSTOMER
(CUSTOMER_ID,
CUSTOMER_NAME,
CUSTOMER_EMAIL,
CUSTOMER_PHONE,
CUSTOMER_ADDRESS,
JOIN_DATE)
values
(302,'Nikhil','john@mail.com',9876543210,'Canada','2023-01-01');



-- Right JOIN
-- everything from the right table and common rows from left table 





--- joins 
-- count 
-- having , order by , group by 


