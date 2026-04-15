package april14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue);










      /*  Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
//      //  System.out.println(stack);
//        System.out.println(stack.remove(3));
//       // System.out.println(stack.peek());
//        System.out.println(stack);

        stack.add(1000);
        stack.push(99);
        System.out.println(stack);

        System.out.println(stack.pop());*/
    }
}
