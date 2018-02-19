package singleton;

/**
 * 之前的1~4都是懒加载单例模式，即类加载时并不创建实例，第一次调用时才真正创建实例，
 * 使用静态内部类的方式实现单例模式，在类被加载时即创建了实例，被调用时直接返回实例即可。
 */
public class Singleton5 {
    private Singleton5() {
    }

    private static class Singleton5Holder {
        public static final Singleton5 instance = new Singleton5();

    }

    public static Singleton5 getInstance(){
        return Singleton5Holder.instance;
    }

    public void show(){
        System.out.println("This is Singleton5");
    }

}
