package state;

public class Worker {

    private WorkState currentState;

    private Integer hour;

    private Boolean taskFinished = false;

    public Worker() {
        this.currentState = new MoringWorkState();
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public WorkState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(WorkState currentState) {
        this.currentState = currentState;
    }

    public Boolean getTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
    }

    public void howAreYou() {
        currentState.howAreYou(this);
    }
}
