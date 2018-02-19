package bridge;

public class PhoneBrandA extends PhoneBrand {
    @Override
    public void run() {
        System.out.print("Brand A - ");
        software.run();
    }
}
