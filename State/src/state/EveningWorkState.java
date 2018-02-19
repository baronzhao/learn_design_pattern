package state;

public class EveningWorkState implements WorkState {



    @Override
    public void howAreYou(Worker worker) {
            System.out.println("I'm happy to go home now in the evening.");
    }
}
