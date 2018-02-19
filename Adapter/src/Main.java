import adapter.LibAdapter;
import adapter.LibAdapterInterface;

/**
 * 适配器模式（Adapter）
 * 将一个类的接口转换成客户希望看到的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Adapter pattern!");

        LibAdapterInterface libAdapter = new LibAdapter();
        libAdapter.customMethod();

        return;
    }
}
