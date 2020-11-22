import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,0};
//        insertSort(arr);
        buddleSort(arr);
        System.out.println(Arrays.toString(arr));

    }


    public static void insertSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
             }
            swap(arr,i,min);
        }
    }

    public static void buddleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length -1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
