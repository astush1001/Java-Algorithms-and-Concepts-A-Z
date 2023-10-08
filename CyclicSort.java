import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        //int[] nums={5,4,3,2,1,0};     [0 to N] : int correct=arr[i]
        int[] nums={5,4,3,2,1};         //[1 to N] : int correct=arr[i]-1
        sortCyclic(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sortCyclic(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int t=arr[i];
                arr[i]=arr[correct];
                arr[correct]=t;
            }else{
                i++;
            }
        }
    }
}
