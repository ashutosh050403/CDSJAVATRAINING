public class Sortingquick {
    public static int partition(int[] arr,int low,int high) {
      int pivot = arr[high];
      int i=low-1;
      for(int j=low;j<high;j++){
          if(arr[j]<pivot){
              i++;

              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=arr[i];
          }
      }
      i++;
      int temp=arr[i];
      arr[i]=arr[high];
      arr[high]=temp;

       return i;
    }
    public static void quickSort(int[] arr,int low ,int high) {
        if (low < high) {
            int pvidx = partition(arr, low, high);

            quickSort(arr, low, pvidx - 1);
            quickSort(arr, pvidx + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,7,3,11,24,9};

        quickSort(arr,0, arr.length-1);
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
