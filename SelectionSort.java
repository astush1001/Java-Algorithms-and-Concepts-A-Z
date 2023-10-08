import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0, 6, 4, 88, 2, 1, 3, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            
            // Find the index of the maximum element in the unsorted part of the array.
            int max = getMax(arr, 0, last);
            
            // Swap the maximum element with the last element in the unsorted part.
            if (arr[max] > arr[last]) {
                swap(arr, max, last);
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        // Swap elements at index 'a' and 'b' in the array.
        // This can be done using temporary variable or without it as shown below:
        // int temp = arr[a];
        // arr[a] = arr[b];
        // arr[b] = temp;
        
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    static int getMax(int[] arr, int start, int last) {
        int max = start;
        
        // Iterate through the array from 'start' to 'last' and find the index of the maximum element.
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
