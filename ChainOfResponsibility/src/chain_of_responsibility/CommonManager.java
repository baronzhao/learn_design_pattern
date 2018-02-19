package chain_of_responsibility;

public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void request(Request request) {
        if (Constant.REQUEST_TYPE_LEAVE.equals(request.getType()) && request.getCount() <= 2) {
            System.out.println("[" + name + "]批准[" + request.getName() + "]请假" + request.getCount() + "天");
            return;
        } else if (null != superior) {
            System.out.println("[" + name + "]无权处理，转向上级处理");
            superior.request(request);
        }
    }
}
