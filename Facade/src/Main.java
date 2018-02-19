import system.SubSystemFacade;

/**
 * 外观模式（Facade）
 * 为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Facade pattern!");

        SubSystemFacade facade = new SubSystemFacade();

        facade.showOneAndFour();
        System.out.println();
        facade.showTwoAndThree();
        System.out.println();
        facade.showOneAndTwo();

        return;
    }
}
