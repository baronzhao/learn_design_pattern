import memento.GameRole;
import memento.GameRoleMementoCaretaker;

/**
 * 备忘录模式（Memento）
 * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复到原先保存的状态。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Memento pattern!");

        GameRoleMementoCaretaker mementoCaretaker = new GameRoleMementoCaretaker();

        GameRole role = new GameRole("Baron");
        role.init();
        role.showRole();
        role.pass();
        role.pass();
        role.showRole();
        System.out.println("\nSave backup point...");
        mementoCaretaker.setMemento(role.saveStatus());
        role.pass();
        role.pass();
        role.showRole();
        System.out.println("\nGame over! Read from backup point...");
        role.recoveryStatus(mementoCaretaker.getMemento());
        role.showRole();

        return;
    }
}
