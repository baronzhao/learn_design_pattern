package command;

public class BakeMuttonCommand extends Command {

    private Integer count;

    public BakeMuttonCommand(Kitchen receiver, Integer count) {
        super(receiver);
        this.count = count;
    }

    @Override
    public void excuteCommand() {
        if(count > 0){
            receiver.bakeMutton(count);
        }
    }

    @Override
    public String toString() {
        return "烤羊肉串X" + count;
    }
}
