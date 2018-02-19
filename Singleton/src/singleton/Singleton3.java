package singleton;

/**
 * 将synchronized锁在判断实例为空后，即为创建过程保障线程安全，
 * 这里特别要注意在synchronized代码块中还需要二次实例非空判断，
 * 因为多线程下被阻塞的线程在前序线程创建完实例释放锁后还会进入synchronized代码块，
 * 如果此时不检查实例是否为空就直接创建，会导致多个实例被创建。
 *
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance(){
        if(null == instance){
            synchronized (Singleton4.class){
                if (null == instance){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("This is Singleton3");
    }
}
