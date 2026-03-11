package mar10;

public class HondaCivic extends Car{

    String brand;
    String bodyType;

    void start(){
        System.out.println("Honda class");
    }

    public HondaCivic(String bodyType, String brand) {
        super(bodyType, brand);
    }

    void run(){
        System.out.println(super.bodyType);
        super.start();
    }
}
