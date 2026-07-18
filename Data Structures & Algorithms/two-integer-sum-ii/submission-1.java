class Solution {
    public int[] twoSum(int[] num, int target) {

      int ans [] = new int[2];
      int n  = num.length;

      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
           int sum = num[i]+num[j];
           if(sum==target)
           {
              ans[0]=i+1;
              ans[1]=j+1;
              break;
           }
        }
      } 
      return ans; 
    }
}
