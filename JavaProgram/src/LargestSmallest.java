public class LargestSmallest {
    public static void findNumber(int[] arr){
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            } else if (arr[i]<smallest) {
                smallest=arr[i];
            }
        }
        System.out.println("largest no.: "+largest);
        System.out.println("smallest no.: "+smallest);
    }
    public static void main(String[] args) {
        int[] arr={1,7,3,11,24,9};
        findNumber(arr);
    }
}
