import java.util.*;
public class Assignment2 {
       public static int maxDiffCand(int[] nums){
          HashSet<Integer> set = new HashSet<>();
          int n = nums.length;
          for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
          }
          int result = set.size();
          if(result > n/2){
            return n/2;
          }
          return result;
       }
       public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,34,5,3,6,2,3,8,4,9};
        System.out.println(maxDiffCand(arr)); // Output 3
       }
    }
