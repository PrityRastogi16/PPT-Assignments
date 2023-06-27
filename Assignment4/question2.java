import java.util.*;

class Assignment4
      {
         public static List<List<Integer>> commonInt(int[] arr1, int[] arr2){
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            List<Integer> distinct1 = new ArrayList<>();
            List<Integer> distinct2 = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>(); 
            
            for(int num : arr1){
                set1.add(num);
            }   
            for(int num : arr2){
                set2.add(num);
            }   
            for(int num : set1){
                if(!set2.contains(num)){
                    distinct1.add(num);
                }
            }
            for(int num : set2){
                if(!set1.contains(num)){
                    distinct2.add(num);
                }
            }
            ans.add(distinct1);
            ans.add(distinct2);
            return ans;
        }
    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {2,4,6};
        System.out.println(commonInt(arr1, arr2));  //[1,5]
    }
}	