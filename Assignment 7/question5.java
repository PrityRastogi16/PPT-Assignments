public class Assignment7 {
    public static String stringSum(String s, int k) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            result.append(reverse(s, i, i + k - 1));
            i = i + (2 * k);
        }
        return result.toString();
    }

    public static String reverse(String s, int l, int h) {
        char[] charArray = s.toCharArray();
        while (l < h) {
            char temp = charArray[l];
            charArray[l] = charArray[h];
            charArray[h] = temp;
            l++;
            h--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(stringSum(s, k));
    }
}
