package feb28;

public class Test {

    int x = 10; // instance variable , which belongs to the class


    public void show(){
        System.out.println(x);
    }


    public void test(int x){
      //int x = 20; // local variable
       show();
        System.out.println(this.x);
    }

}
