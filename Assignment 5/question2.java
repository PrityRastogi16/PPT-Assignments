import java.util.Arrays;
public class Assignment5 {
    public static int ladder(int n) {
      long low = 1, high = n;
      while(low <= high){
          long mid = low + (high-low)/2;
          long sum = mid*(mid+1)/2;
          if(sum == n){
              return (int)mid;
          }else if(sum < n){
              low = mid + 1;
          }else{
              high = mid- 1;
          }
      }
      return (int)high;
      }
    
      public static void main(String[] args) {
        int n = 3;
        System.out.println(ladder(n));
        
      }
}
