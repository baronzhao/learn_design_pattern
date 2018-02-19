import proxy.SubjectProxy;

/**
 * 代理模式（Proxy）
 * 为其他对象提供一种代理以控制对这个对象的访问。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Proxy pattern!");

        SubjectProxy proxy = new SubjectProxy();
        proxy.request();

        return;
    }
}
