package room;

public class Painting extends RoomDecorator {
    @Override
    public void show() {
        super.show();
        System.out.println("There is an antique painting on the wall.");
    }
}
