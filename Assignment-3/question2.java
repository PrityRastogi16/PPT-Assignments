import java.util.*;;

import javax.swing.text.html.parser.TagElement;

public class Assignment3 {
    public static List<List<Integer>> fourSum(int [] nums , int target){
        List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       int n = nums.length;
       for(int i = 0; i < n-3; i++){
        if(i > 0 && nums[i] == nums[i-1]){
            continue;
        }
        for(int j = i+1; j < n-2; j++){
            if(j > i+1 && nums[j] == nums[j-1]){
                continue;
            }
            int left = j+1;
            int ryt = n-1;
            while(left < ryt){
                int currSum = nums[i] + nums[j] + nums[left] + nums[ryt];
                if(currSum == target){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[ryt]));
                    while(left < ryt && nums[left] == nums[left]+1){
                           left++;
                    }
                    while(left < ryt && nums[ryt] == nums[ryt-1]){
                        ryt--;
                    }
                    left++;
                    ryt--;

                }else if(currSum < target){
                    left++;
                }else{
                    ryt--;
                }
            }
        }
       }
       return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(fourSum(nums,target));
        
    }
}
