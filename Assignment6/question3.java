public class Assignment6{
       public static boolean validMountain(int[] arr){
        int n = arr.length;
        if(n < 3){
            return false;
        }
        int i =0;
        while(i < n-1 && arr[i] < arr[i+1]){
            i++;
        }
        if(i == 0 || i == n-1){
            return false;
        }
        while(i < n-1 && arr[i] > arr[i+1]){
            i++;
        }
        return i == n-1;
       }
       public static void main(String[] args) {
       int[] arr = {0,1,2,4,5,3,2,9};
       System.out.println(validMountain(arr));
       
       }
}