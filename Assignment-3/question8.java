import java.util.*;

class Assignment3
      {
         public static boolean attendMeeting(int[][] intervals){
            Arrays.sort(intervals , (a,b) -> a[0] - b[0]);
            for(int i = 1; i < intervals.length; i++){
                if(intervals[i][0] < intervals[i-1][1]){
                    return false;
                }
            }
            return true;
         }
         public static void main(String[] args)
        {
        int[][] intervals = {{0,30} , {5,10} , {15,20}};
        System.out.println(attendMeeting(intervals));
        }
    }	