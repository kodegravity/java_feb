package april7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
       // List<Integer> list = Arrays.asList(10, 34, 6, 4, 764, 75, 75, 86);

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 34, 6, 4, 764, 75, 75, 86));

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();

            if(next == 34){
                iterator.remove();
            }
        }
        System.out.println(arrayList);


    }
}
