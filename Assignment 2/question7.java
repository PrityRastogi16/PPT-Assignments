import java.util.Arrays;

public class Assignment3 {
    public static boolean checkMonotonic(int [] nums){
       boolean increasing = true;
       boolean decreasing = true;
       for(int i = 1; i < nums.length; i++){
        if(nums[i] > nums[i-1]){
            decreasing = false;
        }
        if(nums[i] < nums[i-1]){
            increasing = false;
        }
       }
       return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,2};
        System.out.println(checkMonotonic(nums));
        
    }
}
