## Recap 

what is a String? 
* array of characters
* immutable 
* literal and new keyword 

String s = new String(); // new keyword is used to allocate the memory

Student s = new Student();

methods 

String s = 


toString() method - to provide the string represenation of an object. 




## Mutable Strings 

StringBuffer
thread safe  - only one thread can execute it


and StringBuilder
not thread safe  - multiple threads can execute it 



## Problem 

Create a class Student - id, name, course, grade 

Profile summary 
1. Student Object 
2. StringBuffer or Builder 
3. append student step by step 
4. print the student profile

profile.append("id").append(")




## Object Oriented Paradigm  [OOPs]

#class
class is a blueprint to create object 
or template 
logical entity


Objects
instance of the class 
physical entity

## pillars of OOP
1. inheritance

inheritance means to reuse the properties and methods of the another class

2. Encapsulation 
binding the data and methods together and restrict the direct access 
using private fields

3. Polymorphism 

static polymorphism : Compile time polymorphism
dynamic polymorphism  : Runtime Polymorphism 

4. Abstraction

abstract 

abstraction means hiding implementation details and showing only the functionality. 


Car -----> drive ----> How engine works? 

Data hiding 
1. Encapsulation 
2. Abstraction 






## Inheriatance 



Inheritance
1. single
2. multi level inheritance


single
Class A [Parent class] Super class                iphone 10 - face id
|                                                    |
Class B [Child class ] Sub class                 iphone 11   face id
....
iphone 17   face id


multi level
Class A                
|                      
Class B                 
|                        
Class C  
      

Problem statement


Person   name, age
  |
Employee  id , salary, email
  |
Manager   roles, manage()





## Is - a relationship 

Employee is a person 

manager is a employee


## Has - a relationship [Aggregation/Compostion]

Employee has an adress 

Student has a course 


Customer has-a Order
Customer has a Address



























