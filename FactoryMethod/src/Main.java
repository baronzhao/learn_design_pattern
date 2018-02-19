import factory.*;
import operate.AbstractOperate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 工厂方法模式（Factory Method）
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。
 */
public class Main {

    public static void main(String[] args) {

        String inputNumberA = null, operateSymbol = null, inputNumberB = null;

        Scanner scanner = new Scanner(System.in);
        Boolean continueFlag = false;

        System.out.println("Welcome to the Factory pattern！");

        do{
            System.out.println("Please input the first number:");
            inputNumberA = scanner.nextLine();
            System.out.println("Please input the operate symbol(+-*/):");
            operateSymbol = scanner.nextLine();
            System.out.println("Please input the second number:");
            inputNumberB = scanner.nextLine();

            List<Double> inputs = new ArrayList<Double>(2);
            inputs.add(Double.parseDouble(inputNumberA));
            inputs.add(Double.parseDouble(inputNumberB));

            Double result = Double.NaN;
            OperaterFactoryInterface operaterFactory = null;
            switch (operateSymbol){
                case "+":
                    operaterFactory = new AddOperateFactory();
                    break;
                case "-":
                    operaterFactory = new SubOperateFactory();
                    break;
                case "*":
                    operaterFactory = new MulOperateFactory();
                    break;
                case "/":
                    operaterFactory = new DivOperateFactory();
                    break;
                default:
                    break;
            }
            if(operaterFactory != null){
                AbstractOperate operate = operaterFactory.createOperate();
                operate.setInputs(inputs);
                try {
                    result = operate.getResult();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("result = " + result);
            }

            continueFlag = false;
            System.out.println("Continue? y/n:");
            String continueInput = scanner.nextLine();
            if (continueInput.contains("Y") || continueInput.contains("y")){
                continueFlag = true;
            }
        }while (continueFlag);
        return;
    }
}
