package april11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StockDemo {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>(32,.5f);
        stock.put("Microsoft", 430);  // entry
        stock.put("Uber", 900);
        stock.put("Oracle", 450);
        stock.put("Google", 1450);
        stock.put("Meta", 340);
        stock.put(null, 9040);
        stock.putIfAbsent("Meta",4000);

        Set<String> set = stock.keySet();

        for (String keys: set) {
            System.out.println(keys);
        }
        System.out.println();
        Collection<Integer> values = stock.values();

        for (Integer value: values) {
            System.out.println(value);
        }

        Set<Map.Entry<String, Integer>> entrySet = stock.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Company Name : "+entry.getKey());
            System.out.println("Stock Price : "+entry.getValue());
        }

    }
}
