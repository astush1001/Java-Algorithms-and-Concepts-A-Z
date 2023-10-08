public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 14, 16, 18};
        int t1=22;
        int t2= 1 ;
        System.out.println(Ceiling(arr, t1));
        System.out.println(Flooring(arr,t2));
    }


    static int Ceiling(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
        if(t>arr[e]){
            return Integer.MAX_VALUE;
        }
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (t == arr[mid]) {
                return arr[mid];
            } else if (t > arr[mid]) {
                s = mid + 1;
            } else if (t < arr[mid]) {
                e = mid - 1;
            }
        }
        return arr[s];
    }
    static int Flooring(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
        if(t<arr[e]){
            return Integer.MIN_VALUE;
        }
        while (s <= e) {
            mid = e - (e - s) / 2;
            if (t == arr[mid]) {
                return arr[mid];
            } else if (t > arr[mid]) {
                s = mid + 1;
            } else if (t < arr[mid]) {
                e = mid - 1;
            }
        }
        return arr[e];
    }

}

