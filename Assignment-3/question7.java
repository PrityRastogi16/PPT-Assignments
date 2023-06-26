import java.util.*;

class Assignment3
      {
         public List<String> findMissingRanges(int[] nums, int lower, int upper) {
            List<String> result = new ArrayList<>();
            long start = lower;
            
            for (int i = 0; i <= nums.length; i++) {
                long end = (i < nums.length) ? nums[i] - 1 : upper;
                
                if (start <= end) {
                    result.add(getRangeString(start, end));
                }
                
                start = end + 2;
            }
            
            return result;
        }
        
        private String getRangeString(long start, long end) {
            if (start == end) {
                return String.valueOf(start);
            } else {
                return start + "->" + end;
            }
        }
         public static void main(String[] args)
        {
         int[] nums = {0, 1, 3, 50, 75};
         int lower = 0;
         int upper = 99;
         
         Solution solution = new Solution();
         List<String> missingRanges = solution.findMissingRanges(nums, lower, upper);
         
         System.out.println("Missing Ranges:");
         for (String range : missingRanges) {
             System.out.println(range);
         }
 
          
        }
    }	