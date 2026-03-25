package mar24;

public class OuterClass {

    class InnerClass {
        void show(){
            System.out.println("Inner class method show");
        }
    }

    public void display(){
        System.out.println("Outer class display Method");
    }
}
