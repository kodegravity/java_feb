package april18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("1012","Iphone", 1500.50));
        list.add(new Product("1012","Macbook", 1800));
        list.add(new Product("1012","Airtag", 30.50));
        list.add(new Product("1012","Speaker", 250.10));
        list.add(new Product("1012","Airpods", 400));

        Collections.sort(list, new PriceComparator());
        System.out.println(list);

        // sorting based on name

        Collections.sort(list, new NameComparator());

    }
}
