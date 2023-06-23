import java.util.Arrays;

public class Assignment3 {
    public static int maxProduct(int [] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        ans = Math.max(nums[0]*nums[1]*nums[n-1] , nums[n-1]*nums[n-2]*nums[n-3]);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
       
        System.out.println(maxProduct(nums));
        
    }
}
