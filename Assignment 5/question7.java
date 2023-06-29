import java.util.*;

public class Assignment5 {
        public static int minInRotatedArray(int[] arr) {
         if(arr.length == 0|| arr == null){
          return 0;
         }
         int start = 0;
         int end = arr.length-1;
         while(start<end){
          int mid = start + (end-start)/2;
          if(arr[end] > arr[mid]){
            end = mid;
          }else{
            start = mid+1;
          }
         }
         return arr[start];
        }
      public static void main(String[] args) {
       int[] arr = {4,5,6,7,1,2};
       System.out.println(minInRotatedArray(arr));
        
      }
}
