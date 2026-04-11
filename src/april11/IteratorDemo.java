package april11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorDemo {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>(32,.5f);
        stock.put("Microsoft", 430);  // entry
        stock.put("Uber", 900);
        stock.put("Oracle", 450);
        stock.put("Google", 1450);
        stock.put("Meta", 340);
        stock.put(null, 9040);
        stock.putIfAbsent("Meta",4000);

        Set<Map.Entry<String, Integer>> entrySet = stock.entrySet();

        // Iterator iterator = list.iterator();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
