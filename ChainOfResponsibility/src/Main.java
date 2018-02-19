import chain_of_responsibility.*;

/**
 * 职责链模式（Chain of Responsibility)
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链传递请求，直到有一个对象处理它为止。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the ChainOfResponsibility pattern!");

        CommonManager commonManager = new CommonManager("主管");
        MajorManager majorManager = new MajorManager("总监");
        GeneralManager generalManager = new GeneralManager("总经理");

        commonManager.setSuperior(majorManager);
        majorManager.setSuperior(generalManager);

        Request request = new Request();
        request.setName("码农老王");
        request.setType(Constant.REQUEST_TYPE_LEAVE);
        request.setCount(3);

        commonManager.request(request);

        System.out.println();
        request.setCount(8);
        commonManager.request(request);

        System.out.println();
        request.setType(Constant.REQUEST_TYPE_RAISES);
        request.setCount(500);
        commonManager.request(request);

        System.out.println();
        request.setCount(1000);
        commonManager.request(request);
    }
}
