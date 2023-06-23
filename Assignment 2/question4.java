import java.util.Arrays;

public class Assignment3 {
    public static boolean placePlant(int[] nums, int n) {
        int len = nums.length;
        int i = 0;
        int count = 0;
        while(i < len){
            if(nums[i] == 0 && (i == 0 || nums[i-1] == 0) && (i == len - 1 || nums[i+1] == 0)){
                count ++;
                if(count == n){
                    return true;
                }
            }
            i++;
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1};
        int n = 2;
        System.out.println(placePlant(nums, n));
        
    }
}
