import java.util.Scanner;

public class BmiCalculator {
    public static float bmiCalculation(float weight,float height){
        return weight/(height*height);
    }
    public static String getBmiCategory(double bmi){
        if(bmi<18.5){
            return "Underweight";
        } else if (bmi>=18.5&&bmi<24.9) {
            return "Normal Weight";
        } else if (bmi>=25&&bmi<29.9) {
            return "Overweight";
        }else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter you weight in kilograms:-");
        float weight=scanner.nextFloat();
        System.out.println("enter you height in meters:-");
        float height= scanner.nextFloat();

        double bmi = bmiCalculation(weight,height);
        System.out.println("your BMI is:- "+bmi);
        System.out.println("you are "+getBmiCategory(bmi));
    }
}
