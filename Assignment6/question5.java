import java.util.*;
public class Assignment6{
       public static int minProdSum(int[] nums1, int[] nums2){
            int n = nums1.length;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int minSum = 0;
            for(int i = 0; i < n; i++){
               minSum += nums1[i]*nums2[n-i-1];
            }
            return minSum;
       }
       public static void main(String[] args) {
       int[] nums1 = {5,3,4,2};
       int[] nums2 = {4,2,2,5};
       System.out.println(minProdSum(nums1, nums2));
       }
    }