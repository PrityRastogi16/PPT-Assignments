import java.util.*;

class Assignment4
      {
         public static List<Integer> commonInt(int[] arr1, int[] arr2, int[] arr3){
            List<Integer> ans = new ArrayList<>();
           int i = 0;
           int j = 0;
           int k = 0;
         while(i < arr1.length && j < arr2.length && k < arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                ans.add(arr1[i]);
                i++;
                j++;
                k++;
            }else{
                if(arr1[i] <= arr2[j] && arr1[i] <= arr3[k]){
                    i++;
                }else if(arr2[j] <= arr1[i] && arr2[j] <= arr3[k]){
                    j++;
                }else{
                    k++;
                }
            }
         }
         return ans;
        }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,5,7,9};
        int[] arr3 = {1,3,4,5,8};
        System.out.println(commonInt(arr1, arr2, arr3));  //[1,5]
    }
}	