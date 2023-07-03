import java.util.*;

public class Assignment7 {
    public static String stringSum(String s){
        char[] s1 = s.toCharArray();
        int n =s.length();
        int i = 0;
       for(int j = 0; j < n; j++){
        if(s1[j] == ' '){
            reverse(s1, i, j-1);
            i = j+1;
        }
       }
       reverse(s1, i, n-1);
      return new String(s1);
    }
    public static void reverse(char[] c, int low , int high){
        
       while(low<high){
        char temp = c[low];
        c[low] = c[high];
        c[high] = temp;
        low++;
        high--;
       }
       
    }
    public static void main(String[] args) {
      String s = "Let's take LeetCode contest";
       System.out.println(stringSum(s));
    }
}