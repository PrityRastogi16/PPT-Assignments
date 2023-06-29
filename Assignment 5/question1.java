import java.util.Arrays;
public class Assignment5 {
    public static int[][] convertIn2D(int[] original , int m , int n) {
        int[][] ans = new int[m][n];
        if(original.length != m*n){
          return new int[0][0];
        }
        for(int i = 0; i < original.length; i++){
          ans[i/n][i%n] = original[i];
        }
        return ans;
      }
    
      public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int m = 2;
        int n = 2;
       int[][] result = convertIn2D(original, m, n);
       for(int[] row : result){
       System.out.println(Arrays.toString(row));
       }
        
      }
}
