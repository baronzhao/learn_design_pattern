import command.*;

/**
 * 命令模式（Command）
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Command pattern!");

        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        Command order1 = new BakeMuttonCommand(kitchen, 5);
        Command order2 = new BakeChickenWingCommand(kitchen, 6);

        waiter.addOrder(order1);
        waiter.addOrder(order2);

        Command order3 = new BakeChickenWingCommand(kitchen, 10);
        waiter.cancelOrder(order2);
        waiter.addOrder(order3);

        waiter.eccuteOrders();


    }
}
