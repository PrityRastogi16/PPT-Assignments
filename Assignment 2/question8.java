import java.util.Arrays;

public class Assignment3 {
    public static int minScore(int [] nums , int k){
       int minNum = nums[0];
       int maxNum = nums[0];
       for(int i = 1; i < nums.length; i++){
        minNum = Math.min(minNum , nums[i]-k);
        maxNum = Math.max(maxNum , nums[i]+k);
       }
       return maxNum-minNum;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,4,1,2,3};
        int k = 2;
        System.out.println(minScore(nums,k));
        
    }
}
