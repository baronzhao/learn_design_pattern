package room;

public class Room {

    private String owner;

    public void show(){
        System.out.println("This is " + owner + "'s room!");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
