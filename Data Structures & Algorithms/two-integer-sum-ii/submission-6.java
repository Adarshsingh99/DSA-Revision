class Solution {
    public int[] twoSum(int[] num, int target) {
    // Binary Search
      int ans [] = new int[2];
      int n  = num.length;

      for(int i=0;i<n;i++)
      {
      
      int key = target-num[i];
      // search key by using Binary Search
      int temp = solve(num,key);

      if(temp!= -1) {
      ans[0] = i+1;
      ans[1] = temp+1;
       break;
      }
      } 
      Arrays.sort(ans); // since only two elemnent so its tc is : 2.###
      return ans; 
    }
    public int solve(int []arr, int key)
    {
      int start=0;
      int end = arr.length-1;
      while(start<=end)
      {
         int mid = (start+end)/2;
         if(arr[mid]== key)
         {
           return mid;
         }
         else if(arr[mid] > key)
         {
            end = mid-1;
         }
         else
         {
            start= mid+1;
         }
      }
      return -1;
    }
}
