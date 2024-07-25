import java.util.Arrays;

public class Uniquearray {
    public static void arrayUnique(int[] arr){
        Arrays.sort(arr);
        int i = 0;
        for(int j = 1; j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,7,3,11,24,9,3};
        arrayUnique(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
