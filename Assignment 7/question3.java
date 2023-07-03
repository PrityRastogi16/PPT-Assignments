import java.util.*;

public class Assignment7 {
    public static String stringSum(String num1 , String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        String res = "";
        while(i>=0 || j>=0 || carry>0 ){
            int sum=0;
            if(i>=0 && j>=0){
                sum+= (num1.charAt(i)-'0')+(num2.charAt(j)-'0') + carry;
                i--; j--;
            }
            else if(i>=0){
                sum+= (num1.charAt(i)-'0') + carry;
                i--;
            }
            else if(j>=0){
                sum+= (num2.charAt(j)-'0') + carry;
                j--;
            }
            if(sum <10) {
                res = Integer.toString(sum) + res;
                carry = 0;
            }
            else{
                res = Integer.toString(sum%10) + res;
                carry = sum/10;
            }
            if(i<0 && j<0 && carry!=0) {
                res = Integer.toString(carry)+res;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
      String num1 = "11";
      String num2 = "252";
       System.out.println(stringSum(num1,num2));
    }
}