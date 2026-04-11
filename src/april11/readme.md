## Recap 

Set ?
Set is an interface which is stores unique elements and it has random order.
Set is inherited from Collection interface 

there are multiple implementation of set but the most common are 
HashSet 
HashSet is implementation of Set interface, which stores unique element in 
random order.
it allows one null element to be inserted

TreeSet 
element are stored in Natural sorting order
this does not allow null element

LinkedHashSet
elements are stored in insertion order.
this allows 1 null element.



## Problem 

Given list of names 
Alice, Bob, John, Mike, Mark, Peter, Bob, John, alice
remove the duplicate names from the given list.



## Map

part of collection but does not inherit from any other interface 

             Map
        --- HashMap 
        --- TreeMap 
        --- LinkedHashMap
        --- ConcurrentHashMap 
        --- IdentityHashMap


Map<K, V>
its a key value pair 
1. key is unique           
2. values can be duplicated
3. it allows 1 null key
4. keys are stored in random order


1. rollno   -------> Names 
2. sin number -----> Names


How to create HashMap 
1. no arg constructor
   it created hashMap with initial capacity of 16 and load factor 0.75
2. const with initial capacity
   public HashMap(int initialCapacity) {
3. const with initial capacity and load factor
   public HashMap(int initialCapacity, float loadFactor) {



## Problem 

Inventory 
Product -------   Price 

Laptop            1500
Mobile            1800
Charger           40
Keyboard          200

find the item with Highest Price? 














