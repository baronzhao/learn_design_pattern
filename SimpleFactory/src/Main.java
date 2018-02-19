import com.sun.org.apache.xpath.internal.operations.Bool;
import operate.AbstractOperate;
import operate.OperateFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 简单工厂模式（SimpleFactory）
 * 通过一个单独的工厂类来管理实例创造过程
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the SimpleFactory pattern！");

        String inputNumberA = null, operateSymbol = null, inputNumberB = null;

        Scanner scanner = new Scanner(System.in);
        Boolean continueFlag = false;

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
            AbstractOperate oper = OperateFactory.createOperate(operateSymbol);
            if(oper != null){
                oper.setInputs(inputs);
                try {
                    result = oper.getResult();
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
