import cashierdesk.DiscountContext;
import java.util.Scanner;

/**
 * 策略模式（Strategy）
 * 它定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化不会影响到使用算法的客户。
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the Strategy pattern!");
        Boolean continueFlag;
        Scanner scanner = new Scanner(System.in);
        String inputTotalPriceString = null;
        Integer inputDiscountType = null;

        do{
            System.out.println("Please input your total price:");
            inputTotalPriceString = scanner.nextLine();
            System.out.println("Please choose current discount number:" +
                    "\n0:no discount\n1:80%\n2:50%\n3:300-80\n4:100-20");
            inputDiscountType = scanner.nextInt();
            scanner.nextLine();

            DiscountContext discountContext = new DiscountContext(Double.parseDouble(inputTotalPriceString), inputDiscountType);
            Double payPrice = discountContext.getPayPriceResult();

            System.out.println("Pay Price = " + payPrice);

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
