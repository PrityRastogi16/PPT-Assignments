import java.util.*;
public class Assignment2 {
  public static int findHarmonious(int[] nums) {
    Arrays.sort(nums);
    int start = 0;
    int end = 0;
    int maxLen = 0;

    while (end < nums.length) {
        int diff = nums[end] - nums[start];
        
        if (diff == 1) {
            maxLen = Math.max(maxLen, end - start + 1);
        }
        
        if (diff <= 1) {
            end++;
        } else {
            start++;
        }
    }

    return maxLen;
}

public static void main(String[] args) {
    int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
    int result = findHarmonious(nums);
    System.out.println(result); // Output: 5
}
}
