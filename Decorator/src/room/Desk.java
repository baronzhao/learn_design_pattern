package room;

public class Desk extends RoomDecorator {
    public Desk() {
    }

    @Override
    public void show() {
        super.show();
        System.out.println("There is a desk in the room.");
    }
}
