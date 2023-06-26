 

  class Assignment3
      {
        public static int targetIndex(int[] arr , int target)
        {
          int low = 0;
          int high = arr.length - 1;
          while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid + 1;
            }
           
          }
          return low;
        }
         
        public static void main(String[] args)
        {
           int[] arr = {1,2,4,5,6};
           int target = 3;
           System.out.println(targetIndex(arr, target));
        }
    }	