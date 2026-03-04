package feb28.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //              0   1     2   3    4
        int[] roll =  {101, 102, 103, 104, 105};

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];  // size = 5
        System.out.println("Enter the elements of an array ");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        System.out.println("Print all the elements of array ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
/*
1. given an array
find the maximum element in that array
arr = 10, 53, 6, 2323, 43, 56

find the minimum
berore
arr = 10, 53, 6, 2323, 43, 56

can we reverse this array .

after reverse
56, 43, 2323, 6, 53, 10  - swapping



// sort this array
56, 43, 2323, 6, 53, 10







 */


    // Arrays
    // homogenous elements
}
