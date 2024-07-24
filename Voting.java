import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age:-");
        int age = sc.nextInt();
        
        if(age>18){
            System.out.println("You are eligible for Voting");
        }else{
            System.out.println("You are not eligible for Voting");
        }
        sc.close();
    }
}
