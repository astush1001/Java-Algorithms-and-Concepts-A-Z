/*

**Explaination**

We are given an array of intergers and a pivot element. We have to make changes to the array such that the elements less than or equal to the pivot element lie on the left side of the array and the elements greater than the pivot element lie on the right side of the array. example:

`int[] arr = {9, 12, 5, 10, 14, 3, 10};`  and `pivot = 10` . The answer array should lool like this: `[9, 5, 10, 3, 10, 12, 14]`

**Approach**

We take two pointers i and j both starting from the 0th index of the array. We proceed as `if arr[i] < pivot` then we swap the `arr[i]` element with the `arr[j]` element and do `i++` and `j++`. else i.e, `if (arr[i] ≤ pivot)` then we only update `i` as `i++`. Here what we end up having is that we have our smaller than pivot elements from `0` to `j-1` and greater than pivot elements from `j` to `i-1`.

*/


// CODE:
public class ArrayPartition {
    public static void main(String[] args) {
        int[] arr = {9, 12, 5, 10, 14, 3, 10};

        System.out.println(Arrays.toString(partition(arr, 10)));
    }
    public static int[] partition(int[] arr, int pivot) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            }
            else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
