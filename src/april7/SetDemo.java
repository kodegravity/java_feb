package april7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(12054);
        linkedHashSet.add(1056);
        linkedHashSet.add(102);
        linkedHashSet.add(1034);
        System.out.println(linkedHashSet);


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5054);
        treeSet.add(130);
        treeSet.add(133);
        treeSet.add(1043);
        treeSet.add(10453);
        treeSet.add(1046);
        treeSet.add(104334);
        treeSet.add(13);
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

     // System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.tailSet(1046)); // headset

        System.out.println(treeSet.ceiling(10));
        System.out.println(treeSet.ceiling(15));
        System.out.println(treeSet.floor(15));




      /*  Set<Integer> set = new HashSet<>();
        set.add(102);
        set.add(103);
        set.add(104);

        Set<Integer> set2 = new HashSet<>();
        set2.add(102);
        set2.add(103);
        set2.add(105);

        set.retainAll(set2);
        System.out.println(set);*/
    }
}
