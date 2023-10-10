/*
**EXPLANATION**

Usage: Count sort is used when the range of the elements is small i.e., the difference between the max and min element is relatively small. Ex. it can be used to sort the students based on marks who appear in an exam like JEE where the no.of student is very high and the range of marks is between 0 and 360. It is a **Stable Sorting Algorithm**. 

In Count Sort, we maintain a frequency array `freqArray` where we store the frequency of each element of the original array. the size of the frequency array is `n`, where `n = (max-min)+1.` After this we proceed as:
1. Convert the frequency array `freqArray` into its Prefix  Sum array.
2. Create an empty array called `ans` of same length as the original array.
3. Run bacward loop on the original array and find the index of the `arr[i]` according to the frequency array and put the `arr[i]` element at that index in the `ans` array, and reduce the frequency by 1 in the frequency array.
4. Fill the original array with the elements of ans array.

Note: We convert the frquency array into its Prefix Sum array and we loop through the array in backward direction because these two together help us to maintain the relative order of elements and acheive stable sorting property. Example: the frequency of $9$ in the freqArray array comes out to be $15$ after the applying prefix sum, when we loop the original array from backward direction, it tells us that the last 9 is to be put on the 15’th position i.e., 14’th index. Then we put 9 on the 15’th postion and reduce the frequency by 1, now the new frequency is 14 which again tells us that the second last 9 is to be put on the 13’th index and so on, for every element. In this way the realtive order of elements is mainatined.

*/

// CODE:
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 5, 3, 4, 3, 9, 6, 4, 6, 5, 8, 9, 9};
        countSort(arr, 3, 9);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr, int min, int max) {

        int[] freqArray = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            freqArray[arr[i] - min] += 1;
        }

        prefixSum(freqArray); // calculate the prefix sum of the frequencies.

        int[] ans = new int[arr.length];

        // run backward loop on the original array and fill the positions in ans array using the original array
        // and the frequency array.
        for (int i=arr.length-1; i>=0; i--) {
            int index = freqArray[arr[i]-min]-1; // -1 at last because index = position - 1;
            ans[index] = arr[i];
            freqArray[arr[i]-min]--; // reduce the frequency by 1.
        }

        // fill the original array with the answer array.
        for (int i=0; i<ans.length; i++) {
            arr[i] = ans[i];
        }
    }

    private static void prefixSum(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }
}
