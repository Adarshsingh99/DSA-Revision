class Solution {
    public int[] twoSum(int[] num, int target) {
        // using two pointer
        int i=0;
        int j = num.length-1;
        while(i<j)
        {
          int sum = num[i]+num[j];
          if( sum == target)
          {
             return new int[]{i+1,j+1};
          }
          else if (sum > target)
          {
            j--;
          }
          else
          {
             i++;
          }
        }
        return new int[]{};
    }
}
