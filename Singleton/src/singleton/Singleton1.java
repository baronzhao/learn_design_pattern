package singleton;

/**
 * private构造方法，避免类被从外部实例化
 * static方法getInstance提供一个访问它的全局访问点
 * 多线程下不能保证单例
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if(null == instance){
            instance = new Singleton1();
        }
        return instance;
    }

    public void show(){
        System.out.println("This is Singleton1");
    }

}
