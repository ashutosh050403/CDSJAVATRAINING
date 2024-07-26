import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Trainer trainer=new Trainer();
        trainer.fname=scanner.nextLine();
        trainer.lname=scanner.nextLine();
        System.out.println(trainer.getName(trainer.fname,trainer.lname));
    }
}
class Trainer{
      String fname;
      String lname;
       String getName(String fname,String lname){
          return lname+" "+fname;
      }
}
class Student{
    String studentName;
    String studentTechnology;
}
