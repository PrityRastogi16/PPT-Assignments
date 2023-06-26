import java.util.*;

public class Assignment3 {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        
         if(n<=1||nums==null){
         return;
         }
         int k=n-2;
        //  for(int i=n-1;i>=0;i--){
            while(k>=0&&nums[k]>=nums[k+1])
              k--;
              if(k>=0){
                  int j=nums.length-1;
                  while(nums[j]<=nums[k])
                  j--;
                      swap(nums, k, j);
                 }
                 reverse(nums,k+1,n-1);
    }
           public void swap(int[] nums,int k,int j){
                  int temp=nums[k];
                    nums[k]=nums[j];
                    nums[j]=temp;
                    //break;
                }
            //reverse(nums,k+1,n-1);
    public void reverse(int[] nums,int k,int j){
            while(k<j){
               swap(nums,k++,j--);
            }
      }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
       System.out.println(nextPermutation(nums));
         
       
        
    }
}
