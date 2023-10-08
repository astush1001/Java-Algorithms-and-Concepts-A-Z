import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        // Example array: [5, 4, 3, 2, 1]
        int[] nums = {5, 4, 3, 2, 1};
        sortCyclic(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortCyclic(int[] arr) {
        int i = 0;
        
        // Continue the process until we have examined all elements in the array.
        while (i < arr.length) {
            int correct = arr[i] - 1; // Calculate the correct index for the current element.
            
            // If the current element is not in its correct position.
            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++; // Move to the next element as it is already in its correct position.
            }
        }
    }
}
