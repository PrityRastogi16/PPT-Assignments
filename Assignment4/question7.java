import java.util.Arrays;

public class Assignment4 {
  public static int maxCount(int m, int n, int[][] ops) {
    int x = m, y = n;
    for (int[] op : ops) {
        x = Math.min(x, op[0]);
        y = Math.min(y, op[1]);
    }
    
    return x * y;
  }

  public static void main(String[] args) {
     int m = 3;
     int n = 3;
     int[][] ops ={{2,2}, {3,3}};
    int ans = maxCount(m,n,ops);
    System.out.println(ans);
    
  }
}
