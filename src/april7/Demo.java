package april7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using for each ");
        for (Integer element: list) {
             if(element.equals(30)){
                 list.remove(3);
             }
        }

        // Iterator
        Iterator<Integer> itr = list.listIterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
