import visitor.*;

/**
 * 访问者模式（Visitor）
 * 一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Visitor pattern!");

        ObjectStructure os = new ObjectStructure();
        Man man = new Man();
        os.add(man);
        os.add(new Woman());

        Success success = new Success();
        os.display(success);

        Failing failing = new Failing();
        os.display(failing);

        System.out.println();
        os.remove(man);
        os.display(success);
    }
}
