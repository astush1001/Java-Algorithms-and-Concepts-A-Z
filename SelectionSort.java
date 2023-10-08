import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={0,6,4,88,2,1,3,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int max=getMax(arr,0,last);
            if(arr[max]>arr[last]){
                swap(arr,max,last);
            }

        }
    }

    static void swap(int[] arr,int a,int b){
//        int temp=arr[a];
//        arr[a]=arr[b];
//        arr[b]=temp;

        arr[a]=arr[a]+arr[b];
        arr[b]=arr[a]-arr[b];
        arr[a]=arr[a]-arr[b];
    }

    static int getMax(int[] arr, int start, int last) {
        int max=start;
        for (int i = start; i <=last; i++) {
            if(arr[max] < arr[i]){
                max=i;
            }
        }
        return max;
    }


}
