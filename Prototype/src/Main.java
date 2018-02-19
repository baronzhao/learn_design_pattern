import resume.Resume;

/**
 * 原型模式（Prototype）
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * 简单理解就是：Clone+修改，但是要注意深复制和浅复制
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Welcome to Prototype pattern!");

        Resume baron = new Resume();
        baron.setName("Baron");
        baron.setAge(29);
        baron.setContext("work hard!");

        Resume claire = baron.clone();
        claire.setName("Claire");
        claire.setAge(28);

        baron.show();
        claire.show();

        return;
    }
}
