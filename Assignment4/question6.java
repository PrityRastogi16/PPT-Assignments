import java.util.Arrays;

public class Assignment4 {
  public static int[] squareArray(int[] nums) {
    int n =nums.length;
     int[] ans = new int[n];
     int low = 0;
     int high = n-1;
     for(int i = n-1; i >= 0; i--){
      if(Math.abs(nums[low]) >= Math.abs(nums[high])){
        ans[i] = nums[low] * nums[low];
        low++;
      }else{
        ans[i] = nums[high] * nums[high];
        high--;
      }
     }
     return ans;
  }

  public static void main(String[] args) {
     int[] nums = {-4,-1,0,3,5,10};
     int[] result = squareArray(nums);
     System.out.println(Arrays.toString(result));
  }
}
