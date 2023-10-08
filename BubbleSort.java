import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {4, 1, 3, 9, 7};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;

        // Outer loop iterates from 0 to n-1 times (n is the array length).
        // It represents the number of passes required to sort the array.
        for (int i = 0; i < arr.length; i++) {
            swapped = false; // Initialize swapped to false for each pass.

            // Inner loop iterates over the unsorted part of the array.
            // It compares adjacent elements and swaps them if they are in the wrong order.
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // Swap arr[j] and arr[j-1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true; // Set swapped to true if a swap occurred.
                }
            }

            // If no elements were swapped in this pass, the array is already sorted.
            // We can break out of the loop early to optimize the algorithm.
            if (!swapped) {
                break;
            }
        }
    }
}
