import room.Chair;
import room.Desk;
import room.Painting;
import room.Room;

/**
 * 装饰器模式（Decorator）
 * 动态的给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Decorator pattern!");

        Room room = new Room();
        Desk desk = new Desk();
        Chair chair = new Chair();
        Painting painting = new Painting();

        room.setOwner("Claire");
        desk.decorator(room);
        chair.decorator(desk);
        painting.decorator(chair);

        painting.show();

        System.out.println();

        room.setOwner("Claire");
        chair.decorator(room);
        painting.decorator(chair);

        painting.show();

        return;
    }
}
