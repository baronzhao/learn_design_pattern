package singleton;

/**
 * 4比3在声明instance时多使用了一个volatile类型修饰符，
 * Java中new一个对象的过程并不是原子操作，可能会导致拿到锁的线程还没有完成整个实例化过程，
 * 比如只是对instance开辟了内存空间却还没执行构造函数时，下一个线程判断线程实例不为空直接使用。
 *
 * 在 Java 5 之后，引入扩展关键字 volatile 的功能，它能保证：
 *   对 volatile 变量的写操作，不允许和它之前的读写操作打乱顺序；对 volatile 变量的读操作，不允许和它之后的读写乱序。
 *
 * 题外话，即使用了volatile也并不一定万事大吉，如果你运行代码的虚拟机并没有很好的支持volatile类型修饰符，加了也白加
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance(){
        if(null == instance){
            synchronized (Singleton4.class){
                if (null == instance){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void show(){
        System.out.println("This is Singleton4");
    }

}
