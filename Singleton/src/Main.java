import singleton.*;

/**
 * 单例模式（Singleton）
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Singleton pattern");

        Singleton1.getInstance().show();
        Singleton2.getInstance().show();
        Singleton3.getInstance().show();
        Singleton4.getInstance().show();
        Singleton5.getInstance().show();
        Singleton6.INSTANCE.show();
    }
}
