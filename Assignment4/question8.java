import java.util.Arrays;

public class Assignment4 {
  public static int[] maxCount(int n, int[] nums) {
   int m = nums.length;
   int[] ans = new int[m];
   int idx = 0;
   for(int i = 0; i < n; i++){
    ans[idx++] = nums[i];
    ans[idx++] = nums[i+n];
   }
   return ans;
  }

  public static void main(String[] args) {
     int n = 3;
     int[] nums ={2,5,1,3,4,7};
    int[] result = maxCount(n,nums);
    System.out.println(Arrays.toString(result));
    
    
  }
}
