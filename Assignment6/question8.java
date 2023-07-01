import java.util.*;
public class Assignment6{
       public static int[][] multiplySparseMatrices(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] result = new int[m][n];

        // Create CSR representation of mat1
        int[] rowPtr1 = new int[m + 1];
        int[] colInd1 = new int[m * k];
        int[] val1 = new int[m * k];
        int idx1 = 0;
        int rowPtrIdx = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (mat1[i][j] != 0) {
                    colInd1[idx1] = j;
                    val1[idx1] = mat1[i][j];
                    idx1++;
                }
            }
            rowPtr1[rowPtrIdx] = idx1;
            rowPtrIdx++;
        }

        // Multiply CSR representation of mat1 and mat2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int p = rowPtr1[i]; p < rowPtr1[i + 1]; p++) {
                    sum += val1[p] * mat2[colInd1[p]][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat1 = {
                {1, 0, 0},
                {-1,0,3},
        };
        int[][] mat2 = {
                {7,0,0},
                {0, 0,0},
                {0, 0,1}
        };

        int[][] result = multiplySparseMatrices(mat1, mat2);

        System.out.println("Result:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}