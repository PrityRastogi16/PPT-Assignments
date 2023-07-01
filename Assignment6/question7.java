import java.util.*;
public class Assignment6{
       public static int[][] original(int n){
        int[][] mat = new int[n][n];
        int rs = 0 , re = n-1 , cs = 0, ce=n-1;
        int num = 1;
        while(num <= n*n){
            for(int i = cs; i <= ce; i++){
                mat[rs][i] = num++;
            }
            rs++;
            for(int i = rs; i <= re; i++){
                mat[i][ce] = num++;
            }
            ce--;
            for(int i = ce; i >= cs; i--){
                mat[re][i] = num++;
            }
            re--;
            for(int i = re; i >= rs; i--){
                mat[i][cs] = num++;
            }
            cs++;
        }
        return mat;
        
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = original(n);
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
        }
        }
    }
