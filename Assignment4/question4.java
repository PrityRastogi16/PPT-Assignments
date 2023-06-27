import java.util.*;

class Assignment4
      {
         public static int minSum(int[] nums){
            Arrays.sort(nums);
            int sum = 0;
            for(int i = 0; i < nums.length-1; i+=2){
               sum += nums[i];
            }
          return sum;
        }
    public static void main(String[] args){
        int[] nums = {1,4,3,2};
        System.out.println(minSum(nums));
    }
}	