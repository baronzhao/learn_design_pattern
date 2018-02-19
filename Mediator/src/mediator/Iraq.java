package mediator;

public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message, this);
    }

    public void receiveMessage(String message){
        System.out.println("Iraq received message:" + message);
    }
}
