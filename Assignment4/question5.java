import java.util.*;

class Assignment4
      {
         public static int totalStaircase(int n){
          int count = 0;
          int i = 1;
         while(n > i){
          n = n - i;
            count++;
            if(n > 0){
              i++;
            }
            else if(n == 0){
              return count;
            }else if(n < 0){
              return count-1;
            }
          }
          return count;
        }
    public static void main(String[] args){
        int n = 11;
        System.out.println(totalStaircase(n));
    }
}	