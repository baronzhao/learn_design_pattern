package room;

public class RoomDecorator extends Room {

    private Room room;

    public void decorator(Room room) {
        this.room = room;
    }

    @Override
    public void show() {
        if(room != null){
            room.show();
        }
    }
}
