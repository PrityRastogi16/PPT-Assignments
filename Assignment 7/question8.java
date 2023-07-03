import java.util.*;
public class Assignment7 {
    public static boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        // Calculate initial slope
        double slope = (double) (y2 - y1) / (double) (x2 - x1);

        // Check remaining points
        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];

            // Handle vertical alignment
            if (x2 - x1 == 0) {
                if (xi - x1 != 0) {
                    return false;
                }
            } else {
                double currSlope = (double) (yi - y1) / (double) (xi - x1);
                if (currSlope != slope) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}};
        boolean isStraightLine = checkStraightLine(coordinates);
        System.out.println(isStraightLine); // Output: true
    }
}
