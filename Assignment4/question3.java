import java.util.*;

class Assignment4
      {
         public static int[][] transposeMatrix(int[][] matrix){
           int m = matrix.length;
           int n = matrix[0].length;
           int[][] result = new int[n][m];
           for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                result[i][j] = matrix[j][i];
            }
           }
            return result;
        }
    public static void main(String[] args){
        int[][] matrix = {{2,4,-1}, {-10,5,11}, {18,-7,6}};
        int[][] transpose = transposeMatrix(matrix);
        for (int[] row :  transpose) {
            System.out.println(Arrays.toString(row));
        }
    }
}	