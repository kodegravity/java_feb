## Recap 

### Object class

super class of all the classes 

toString()

## encapsulation 
getter/setter

private modifier

super keyword ? 
variable 
method
constructor


## Polymorphism 

whenever a method behaves differently in diff situation 
when you pass diff objects 


1. compile time polymorphism 

method overloading 
methods with same name but different parameters 

void test(int a, int b ){

}

void test(double a , double b ){

}


## Problem 


class Shape 

double area(int side){

}

calcualte the area of 
1. rectangle
2. square 
3. circle : pi R * R


## UserLogin

login(username)
login(username, password)
login(username, email, password)


## Employee salaray 

salary(basicPay)
salary(basicPay , bonus)
salary(basicPay , bonus, overtime)



## Runtime Polymorphism 

method overriding 

inheritance 

A   - method test() 
|
B   -   test()


## Problem
                                 Employee calculateSalary()
        |                           |                   |
    FullTimeEmployee                PartTimeEmployee    ContactEmployee


calculateSalary(hoursWorked , payRate)
Hours            Pay
FT : 40          30       
PT : 20          25
C  : 40          50e


## Abstraction 
Data hiding 

hiding the internal implementation details and showing only the essential features.


Car -----> important features,      ---- how engine works?
Mobile -----> Features   --internal NO


User knows what object does, but not how it does.


adv:
complexity 
loose coupling 

# How to achieve abstraction 

1. using abstract class  [0- 100%] 
2. using interfaces      [100%]


            Nofication System  [abstract]sendNotification  receiveNotification
    |           |               |
Email           SMS             PushNotification
sendNotification, receiveNotification
Improvise a bit more on this 





























2. runtime polymorphism 

























