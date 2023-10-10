public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 14, 16, 30, 38};
        int key = 30;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);  
        
    }

static void binarySearch(int arr[], int first, int last, int key){  
    // Calculate the middle index
   int mid = (first + last)/2;  
   // While the search interval is valid
   while( first <= last ){  
      // If the middle element is less than the key, search the right half
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }
      // If the middle element is equal to the key, the key is found
      else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }
      // If the middle element is greater than the key, search the left half
      else{  
         last = mid - 1;  
      }  
      // Recalculate the middle index for the next iteration
      mid = (first + last)/2;  
   }  
   // If the search interval is exhausted and the key is not found
   if ( first > last ){  
      System.out.println("Element is not found!");  
       } 
    }
}
