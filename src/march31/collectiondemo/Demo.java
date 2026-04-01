package march31.collectiondemo;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<Integer> oldList = new LinkedList<>(); //  100-200-300
        oldList.add(100);
        oldList.add(200);
        oldList.add(300);
        oldList.add(400);
        oldList.add(500);

        List<Integer> list = new ArrayList<>(); // 100, 200, 300
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.add(2, 4000);
        System.out.println(list);

        list.addAll(3, oldList);
        System.out.println(list);


        // convert list to array
        Object[] objects = list.toArray();
        for (Object o: objects) {
            System.out.println(o);
        }

        list.set(1,10000);
        System.out.println(list);

        System.out.println(list.get(2));

    }
}
