import java.util.*;

public class Assignment5 {
        public static List<Integer> appearTwice(int[] arr) {
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
              int idx = Math.abs(arr[i])-1;
              if(arr[idx] < 0){
                ans.add(idx+1);
              }else{
                arr[idx] *= -1;
              }
            }
            return ans;
        }
      public static void main(String[] args) {
       int[] arr = {4,3,2,7,8,2,3,1};
       System.out.println(appearTwice(arr));
        
      }
}
