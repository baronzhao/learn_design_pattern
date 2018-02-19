package chain_of_responsibility;

public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void request(Request request) {
        if (Constant.REQUEST_TYPE_LEAVE.equals(request.getType())) {
            System.out.println("[" + name + "]批准[" + request.getName() + "]请假" + request.getCount() + "天");
            return;
        } else if (Constant.REQUEST_TYPE_RAISES.equals(request.getType())) {
          if(request.getCount() <= 500){
              System.out.println("[" + name + "]批准[" + request.getName() + "]加薪" + request.getCount() + "元");
          }else{
              System.out.println("[" + name + "]驳回[" + request.getName() + "]加薪" + request.getCount() + "元");
          }
        }
    }
}
