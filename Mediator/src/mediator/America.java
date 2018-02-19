package mediator;

public class America extends Country {

    public America(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message, this);
    }

    public void receiveMessage(String message){
        System.out.println("America received message:" + message);
    }
}
