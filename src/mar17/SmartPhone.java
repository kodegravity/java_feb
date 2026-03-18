package mar17;

public class SmartPhone extends Pager implements Calculator, MobilePhone, MusicPlayer, Computer{
    @Override
    public void calculate() {
        System.out.println("SmartPhone can calculate....");
    }

    @Override
    public void surfInternet() {
        System.out.println("we can browse internet using smartphone.");
    }

    @Override
    public void makeCalls() {
        System.out.println("Can make calls using smartphone");
    }

    @Override
    public void receiveCalls() {
        System.out.println("Can receive calls using smartphone");
    }

    @Override
    public void play() {
        System.out.println("You can play music on smartphone");
    }

    @Override
    public void pause() {
        System.out.println("You can pause music on smartphone");

    }

    @Override
    public void rewind() {
        System.out.println("You can rewind music on smartphone");

    }

    @Override
    public void ringAlarm() {
        System.out.println("Using pager ...");
    }
}
