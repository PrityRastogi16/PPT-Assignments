import java.util.*;
public class Assignment6{
       public static int[] original(int[] changed){
         int n = changed.length;
         if (changed.length % 2 != 0) {
            return new int[0];
        }

        Arrays.sort(changed);

        Set<Integer> seen = new HashSet<>();
        int[] ans = new int[n/2];
        int k =0;

        for (int num : changed) {
            if (seen.contains(num / 2)) {
               ans[k++] = num/2;
                seen.remove(num / 2);
            } else {
                seen.add(num);
            }
        }

        if (!seen.isEmpty()) {
            return new int[0];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = original(changed);
            for (int num : original) {
                System.out.print(num + " ");
            }
        }
    }
