import java.util.Scanner;

public class Currencycalculator {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 1 for INR_to_USD");
        System.out.println("Enter 2 for USD_to_INR");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                INR_to_USD();
                break;
            case 2:
                USD_to_INR();
                break;
            default:
                System.out.println("you entered wrong choice");
        }
    }

    private static void USD_to_INR() {
        System.out.println("enter your amount:-");
        float amount=scanner.nextFloat();
        System.out.println("your amount in USD:- "+(amount*83.76));
    }

    private static void INR_to_USD() {
        System.out.println("enter your amount:-");
        float amount=scanner.nextFloat();
        System.out.println("your amount in USD:- "+(amount/83.76));
    }
}
