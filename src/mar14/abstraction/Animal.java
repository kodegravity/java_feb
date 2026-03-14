package mar14.abstraction;

public abstract class Animal {

     abstract void makeSound();
     abstract void sleep();
     abstract void walk();
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    void walk() {
        System.out.println("Dog walks");
    }
}







/*
rules
1. use keyword abstract in class
2. abstract methods does not have body
3. if a class has abstract method, class must be abstract
4. we cannot create object of abstract class



 */