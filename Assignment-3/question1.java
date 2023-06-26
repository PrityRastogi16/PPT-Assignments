import java.util.Arrays;

import javax.swing.text.html.parser.TagElement;

public class Assignment3 {
    public static int closetSum(int [] nums , int target){
       Arrays.sort(nums);
       int n = nums.length;
       int closeSum = Integer.MAX_VALUE;
       for(int i = 0; i < n-2 ; i++){
        if(i > 0 && nums[i] == nums[i-1]){
            continue;
        } 
        int left = i+1;
        int ryt = n-1;
        while(left < ryt){
            int currSum = nums[i] + nums[left] + nums[ryt];
            if(Math.abs(currSum-target) < Math.abs(closeSum-target)){
                closeSum = currSum;
            }
            if(currSum > target){
                ryt--;
            }else if(currSum < target){
                left++;
            }else{
                return target;
            }
        }
       }
       return closeSum;
    }

    public static void main(String[] args) {
        int[] nums = {4, -1, 2, -5, 3, 0};
        int target = 1;
        System.out.println(closetSum(nums,target));
        
    }
}
