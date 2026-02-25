package feb24;

public class DateDemo {
    int day;
    int month;
    int year;

    public DateDemo() {
        System.out.println("Default constructor");
    }

    public DateDemo(int day) {
        this();
        System.out.println("Constructor with 1 parameter");
        this.day = day;
    }

    public DateDemo(int day, int month) {
        this(10);
        System.out.println("Constructor with 2 parameter");
        this.day = day;
        this.month = month;
    }

    public DateDemo(int day, int month, int year) {
        this(10,22);
        System.out.println("Constructor with 3 parameter");
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
