package singleton;

/**
 * 使用枚举实现单例模式，简洁，可序列化
 */
public enum Singleton6 {

    INSTANCE;

    public void show(){
        System.out.println("This is Singleton6");
    }

}
