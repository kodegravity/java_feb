package april11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>(32,.5f);
        stock.put("Microsoft", 430);
        stock.put("Uber", 900);
        stock.put("Oracle", 450);
        stock.put("Google", 1450);
        stock.put("Meta", 340);
        stock.put(null, 9040);
        stock.putIfAbsent("Meta",4000);

        System.out.println(stock.get("Microsoft"));
        System.out.println(stock.getOrDefault("Google", 1000));

        stock.replace("Meta",324234);

        Set<String> set = stock.keySet();
        System.out.println(set);

        Collection<Integer> values = stock.values();
        System.out.println(values);


        System.out.println(stock.containsKey("Metaaaa"));

        System.out.println(stock.containsValue(430));

      /  Set<Map.Entry<String, Integer>> entrySet = stock.entrySet();/

        //System.out.println(stock);
    }
}
