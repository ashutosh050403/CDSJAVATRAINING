public class Averageofarray {
    public static float average(float[] arr){
        float sum=0f;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        float avg=sum/ arr.length;
        return avg;
    }
    public static void main(String[] args) {
        float[] arr={1,7,3,11,24,9};
        System.out.println(average(arr));
    }
}
