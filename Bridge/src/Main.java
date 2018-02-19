import bridge.PhoneBrandA;
import bridge.PhoneBrandB;
import bridge.PhoneContacts;
import bridge.PhoneGame;

/**
 * 桥接模式（Bridge）
 * 将抽象部分与它的实现部分分离，使它们都可以独立的变化。
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bridge pattern!");

        PhoneBrandA brandA = new PhoneBrandA();
        brandA.setPhoneSoftware(new PhoneGame());
        brandA.run();
        brandA.setPhoneSoftware(new PhoneContacts());
        brandA.run();

        PhoneBrandB brandB = new PhoneBrandB();
        brandB.setPhoneSoftware(new PhoneGame());
        brandB.run();
        brandB.setPhoneSoftware(new PhoneContacts());
        brandB.run();

    }
}
