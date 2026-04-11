package april11;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        int[] arr = {10,23,54,234,234,523,4523,34};

        Arrays.sort(arr);

        for (int elements :arr ) {
            System.out.println(elements);
        }


        List<Integer> list = Arrays.asList(100, 34, 34, 5134, 64, 45, 64);// immutable list
       // list.add(10); // this gives exception

        System.out.println(Arrays.binarySearch(arr, 23));


        System.out.println(Collections.max(list));




      /*  Map<String, Integer> stock = new LinkedHashMap<>();
        stock.put("Microsoft", 430);  // entry
        stock.put("Uber", 900);
        stock.put("Oracle", 450);
        stock.put("Google", 1450);
        stock.put("Meta", 340);
        stock.putIfAbsent("Meta",4000);

        System.out.println(stock);
*/

    }
}
