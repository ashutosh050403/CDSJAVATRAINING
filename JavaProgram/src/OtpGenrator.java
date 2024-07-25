import java.util.Random;


public class OtpGenrator {
    static int otpGenerate(){
        Random random=new Random();
        int otp=random.nextInt(1000000);
        return otp;
    }
    public static void main(String[] args) {
        System.out.println(otpGenerate());
    }
}
