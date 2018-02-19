package room;

public class Chair extends RoomDecorator {

    @Override
    public void show() {
        super.show();
        System.out.println("There is a chair in the room.");
    }
}
