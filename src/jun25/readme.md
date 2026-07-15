## Issue 


Dynamo DB : no SQL database 

LOAD testing 

QA - staging - PROD [release[2 hours]]
5   

1 sec , write and delete 5 times 

rollback : 1 hour: 


=========

SQS - messages 256KB is allowed
      1MB is allowed for FIFO queues

AWS SQS extended client - 2 GB 


================

Github actions


CI/CD tool 

Steps 
1. Push code to github repo
2. workflows 
   run test
   build application [mvn clean install]
   create docker image 
   deploy EC2 / ecs / lambda
staging, production 














