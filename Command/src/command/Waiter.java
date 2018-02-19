package command;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {
    private List<Command> orders = new ArrayList<Command>();

    public void addOrder(Command command){
        orders.add(command);
        System.out.println("新增订单：" + command.toString());
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单：" + command.toString());
    }

    public void eccuteOrders(){
        for (Command command : orders) {
            command.excuteCommand();
        }
    }
}
