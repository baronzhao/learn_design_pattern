package command;

public class BakeChickenWingCommand extends Command {

    private Integer count;

    public BakeChickenWingCommand(Kitchen receiver, Integer count) {
        super(receiver);
        this.count = count;
    }

    @Override
    public void excuteCommand() {
        if(count > 0){
            receiver.bakeChickenWing(count);
        }
    }

    @Override
    public String toString() {
        return "烤鸡翅X" + count;
    }
}
