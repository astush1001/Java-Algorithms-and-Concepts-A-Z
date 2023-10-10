// **EXPLAINATION**

// Radix Sort uses Count Sort underneath.(Refer Count Sort file) In Radix Sort we sort on the basis of places of numbers, starting from one’s place to the last place that exists in the number. Here we apply Count Sort till the number of places of the largest number in // the array. It is also a **Stable Sorting Algorithm**. Here we take the frequency Array of size 10, becuase we are dealing with the individual digits, digits can only lie in the range of 0 to 9. Also, we don’t use min here as we used in Count // // Sort to put the frequency of elements at the right place in the frequency array, again the reason is that the digits will between 0 and 9 and they will be automaticalyy put at the correct index.


public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {9876, 5, 12, 234, 7, 9875, 62};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void radixSort(int[] arr) {
        int max = findMax(arr);
        int exp = 1;
        while (max / exp != 0) {
            countSort(arr, exp);
            exp *= 10;
        }
    }

    private static void countSort(int[] arr, int exp) {
        int[] freqArray = new int[10];
        for (int i=0; i<arr.length; i++) {
            freqArray[arr[i] / exp % 10]++;
        }
        prefixSum(freqArray);

        int[] ans = new int[arr.length];
        for (int i=arr.length-1; i>=0; i--) {
            int index = freqArray[arr[i] / exp % 10]-1;
            ans[index] = arr[i];
            freqArray[arr[i] / exp % 10]--;
        }

        for (int i=0; i<ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    private static void prefixSum(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
