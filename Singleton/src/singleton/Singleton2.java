package singleton;

/**
 * synchronized保障线程安全，但是效率低，为了保障实例创建的唯一而锁方法，在实例创建后多线程调用时依旧串行执行
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public synchronized static Singleton2 getInstance(){
        if(null == instance){
            instance = new Singleton2();
        }
        return instance;
    }

    public void show(){
        System.out.println("This is Singleton2");
    }

}
