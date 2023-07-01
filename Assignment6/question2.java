public class Assignment6{
       public static boolean findTargetIn2D(int[][] mat, int target){
        int row = mat.length;
        int col = mat[0].length;
        int low = 0;
        int high = row*col-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int currRow = mid/col;
            int currCol = mid%col;
            if(mat[currRow][currCol] == target){
                return true;
            }else if(mat[currRow][currCol] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
       }
       public static void main(String[] args) {
       int[][] mat= {{1,3,5,7}, {10,11,16,20} ,{23,30,34,40}};
       int target = 10;
       System.out.println(findTargetIn2D(mat, target));
       }
}