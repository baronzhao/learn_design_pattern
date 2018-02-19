import abstractfactory.DatabaseFactory;
import abstractfactory.DepartmentInterface;
import abstractfactory.UserInterface;

import java.util.Scanner;

/**
 * 抽象工厂模式（Abstract Factory）
 *
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *
 * 在用简单工厂的地方，可以考虑用反射技术来去除switch或if，解除分支判断带来的耦合。
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        System.out.println("Welcome to the Abstract Factory pattern!");

        Scanner scanner = new Scanner(System.in);
        Boolean continueFlag = false;
        String inputString, database;

        do{
            System.out.println("Please choose database number: \n1.Mysql\n2.Oracle");
            inputString = scanner.nextLine();
            switch (inputString){
                case "1":
                    database = "Mysql";
                    break;
                case "2":
                    database = "Oracle";
                    break;
                default:
                    System.out.println("Error input!");
                    database = null;
                    break;
            }
            if (null == database){
                continue;
            }

            DatabaseFactory factory = new DatabaseFactory(database);
            UserInterface user = factory.createUser();
            DepartmentInterface department = factory.createDepartment();
            user.insert();
            department.insert();
            user.delete();
            department.delete();

            continueFlag = false;
            System.out.println("Continue? y/n:");
            String continueInput = scanner.nextLine();
            if (continueInput.contains("Y") || continueInput.contains("y")){
                continueFlag = true;
            }
        }while (continueFlag);


    }
}
