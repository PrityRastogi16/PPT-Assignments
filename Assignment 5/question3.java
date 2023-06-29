import java.util.Arrays;
public class Assignment5 {
    public static int[] sqOfArray(int[] nums) {
         int n = nums.length;
         int low = 0;
         int high = n -1;
         int k = n-1;
         int[] ans = new int[n];
         while(low < high){
            if(Math.abs(nums[low]) <= Math.abs(nums[high])){
                ans[k--] = nums[high] * nums[high];
                high--;
            }else{
                 ans[k--] = nums[low] * nums[low];
                 low++;
            }
         }
         return ans;
      }
      public static void displayArrays(int[] nums){
        for(int num : nums){
            System.out.println(nums + " ");
        }
      }
    
      public static void main(String[] args) {
       int[] nums = {-4,-1,0,3,10};
       int[] result = sqOfArray(nums);
       System.out.println(Arrays.toString(result));
        
      }
}
