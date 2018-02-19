package bridge;

public class PhoneBrandB extends PhoneBrand {
    @Override
    public void run() {
        System.out.print("Brand B - ");
        software.run();
    }
}
