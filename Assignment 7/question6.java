public class Assignment7 {
    public static boolean goalMeet(String s, String goal) {
     int n = s.length();
     int m = goal.length();
     if(n != m){
        return false;
     }
     String sConcat = s+s;
     return sConcat.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "ecadb";
        System.out.println(goalMeet(s, goal));
    }
}
