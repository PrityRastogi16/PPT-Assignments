import java.util.*;
public class Assignment2 {
       public static int maxSum(int[] nums){
        Arrays.sort(nums);
        int max_sum = 0;
        for(int i = 0; i < nums.length; i +=2){
            max_sum += nums[i];
        }
        return max_sum;
       }
       public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        System.out.println(maxSum(arr)); // Output 4
       }
    }
//Time complexeity = O(nlogn)
//Space complexeity = O(1)S