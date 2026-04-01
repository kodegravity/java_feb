package march31;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // try with resources
        try(Scanner scanner = new Scanner(System.in)){
            int x = 10;
            int y = 0;
            System.exit(0);
            int z = x/y;
            System.out.println(x);
        }
    }
}
