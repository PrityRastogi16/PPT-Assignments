import java.util.Arrays;

class Assignment3
      {
        public static int singleOne(int[] nums)
        {
           int result = 0;
           for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
           }
           return result;
  }

         
        public static void main(String[] args)
        {
           int[] arr = {2,2,1,1,3,4,4};
           System.out.println(singleOne(arr));
          
        }
    }	