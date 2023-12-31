import java.util.Arrays;

public class Assignment3 {
    public static int findTarget(int [] nums , int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low  <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 3;
        System.out.println(findTarget(nums, target));
        
    }
}
