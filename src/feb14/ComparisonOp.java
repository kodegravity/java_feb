package feb14;

public class ComparisonOp {
    public static void main(String[] args){

        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;
        // == checks for LHS equals RHS
        System.out.print(x == y); // false
        System.out.print(x < y); // true
        System.out.print( x >= y); // false
        System.out.print( y >= b); // false
        System.out.print( x <= b); // true
        System.out.print( a >= b); // false


        System.out.print((x == y) && (x < 5)); // false
        System.out.print((x < y) || (y> a)); // true
        System.out.print( (x >= y) && (a == 5)); // false
        System.out.print(( y >= b)  || (y == 20)); // true
        System.out.print( !(x <= b)); //false






    }
}
