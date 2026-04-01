## Recap 

Exception Handling 
throw  : create your own exception
vs
throws  : delegate the exception to the caller method


method overloading : same name diff param
vs 
method overriding  : same name in diff classes during inheritance 



finally ?
try{

// statement
}
finally{

}



## Collections

framework which provides architecture to store and manipulate group of Objects 

                            Iterable
                                |
                            Collection [I]
                                |
    
List[I]                   Set[I]                     Queue [I]
  
-  ArrayList                 HashSet                   PriorityQueue [C] 
- LinkedList                LinkedHashSet              Deque [I]
-  Stack                     TreeSet  

            
        Map
        |
       HashMap [most important interview question]
    TreeMap, LinkedHashMap, ConcurrentHashMap, IdentityHashMap





           List  [Parent]
 |                          |
ArrayList               LinkedList
[Child]                 [Child]

// Upcasting
List list = new ArrayList();


List list = new LinkedList();


## ArrayList 

dynamic in nature, 
size can grow 

---- internally backed by Array 

ArrayList list = new ArrayList(); // it will create arraylist of size 10 by default 

java 7 : 

 n + n/2 +1
 array is full to threshold 
10 + 10/2 + 1 = 16
new array list of size 16 will be created


Java 8 :
ArrayList list = new ArrayList();  
list.add(10);   // it will create arraylist of size 10


## LinkedList 

LinkedList does not have indexes
every node has address of the next node

1. singly linkedList 
2. Doubly LinkedList 
3. circular linkedList



Search 

Manipulation / add or remove elements

        ArrayList                                               LinkedList 
        search is better using arraylist                        not recommended
add                                                             better in manipulation



## Create a customized list on the following 

Product - ProductName, sku, price

class Product{
ProductName, sku, price
}

List<Product> products = new ArrayList();
add, remove, set, get 

















Java 25 
Java 21  ---- switch, virtual threads
Java 17   ---- record 
Java 11 -----  var keyword
Java 8  ------ Functional interfaces, Lambdas, stream api [2016 approx]
Java 7 ------- non functional programming



spring ----
springboot - 