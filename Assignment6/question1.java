public class Assignment6{
       public static int[] findPerm(String str){
        int n = str.length();
        int[] ans = new int[n+1];
        int low = 0;
        int high = n;
         for(int i = 0; i< n; i++){
            if(str.charAt(i) == 'I'){
                ans[i] = low;
                low++;
            }else{
                ans[i] = high;
                high--;
            }

         }
         ans[n] = low;
         return ans;
       }
       public static void main(String[] args) {
        String str = "IDIDDDI";
        int[] result = findPerm(str);
        for(int i = 0; i<result.length;i++){
            System.out.print(result[i] + " ");
        }
       }
}