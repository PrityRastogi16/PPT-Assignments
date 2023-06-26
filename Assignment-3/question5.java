import java.util.Arrays;

class Assignment3
      {
        public static int[] incByOne(int[] digits)
        {
            int n=digits.length;
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]<9){
                    digits[i]++;
                    return digits;
                }
                digits[i]=0;
             }
             int[] newNumber=new int[n+1];
             newNumber[0]=1;
             return newNumber;
    }
    public static void printArray(int[] arr) {
      for (int num : arr) {
          System.out.print(num + " ");
      }
      System.out.println();
  }

         
        public static void main(String[] args)
        {
           int[] arr = {1,2,4,5,9};
           int[] result = incByOne(arr);
           printArray(result);
        }
    }	