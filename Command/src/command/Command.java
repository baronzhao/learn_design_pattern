package command;

public abstract class Command {

    protected Kitchen receiver;

    public Command(Kitchen receiver) {
        this.receiver = receiver;
    }

    public abstract void excuteCommand();
}
