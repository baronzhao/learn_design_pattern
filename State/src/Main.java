import state.Worker;

import java.util.Scanner;

/**
 * 状态模式（State）
 * 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the State pattern!");

        Scanner scanner = new Scanner(System.in);
        Boolean continueFlag = false;

        do{
            System.out.println("Please input current hour of day(0 to 24):");
            Integer inputNumber = Integer.valueOf(scanner.nextLine());

            Worker worker = new Worker();
            worker.setHour(inputNumber);
            worker.howAreYou();

            continueFlag = false;
            System.out.println("Continue? y/n:");
            String continueInput = scanner.nextLine();
            if (continueInput.contains("Y") || continueInput.contains("y")){
                continueFlag = true;
            }
        }while (continueFlag);
    }
}
