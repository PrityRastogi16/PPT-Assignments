import java.util.HashMap;

public class Assignment7 {
    public static boolean  isStrobogrammatic(String num){
         int n = num.length();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        int left = 0;
        int right = n-1;
        while(left <= right){
            if(!map.contains(num.charAt(right)) || num.charAt(left) != map.get(num.chartAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
       
    }
    public static void main(String[] args) {
        String num = "69";
       System.out.println(isStrobogrammatic(s, ));
    }
}
