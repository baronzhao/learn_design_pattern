package state;

public class MoringWorkState implements WorkState {

    private Integer TWELVE_CLOCK = 12;

    @Override
    public void howAreYou(Worker worker) {
        if (worker.getHour() < TWELVE_CLOCK){
            System.out.println("I'm fine in the moring.");
        }else {
            worker.setCurrentState(new AfternoonWorkState());
            worker.howAreYou();
        }
    }
}
