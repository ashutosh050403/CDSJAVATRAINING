import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter students marks:");
        int marks= sc.nextInt();
        switch (marks) {
            case 10:
                System.out.println("Fail grade-E");
                break;
            case 30:
                System.out.println("Pass grade-D");
                break;
            case 70:
                System.out.println("Good grade-A");
                break;
            default:
                System.out.println("Absent");
        }
    }
}
