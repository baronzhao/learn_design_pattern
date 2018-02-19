package state;

public class AfternoonWorkState implements WorkState {

    private Integer EIGHTEEN_CLOCK = 18;

    @Override
    public void howAreYou(Worker worker) {
        if (worker.getHour() < EIGHTEEN_CLOCK){
            System.out.println("I'm tired in the afternoon.");
        }else {
            worker.setCurrentState(new EveningWorkState());
            worker.howAreYou();
        }
    }
}
