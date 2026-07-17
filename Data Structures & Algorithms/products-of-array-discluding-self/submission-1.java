class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Division Approach
        int n = nums.length;
        int prod = 1, zeroCount =0;
        for(int num : nums)
        {
         if(num==0)
         {
          zeroCount++;
         }
         else
         {
            prod*=num;
         }
        }
        if(zeroCount >1) return new int[n];
        int res[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(zeroCount > 0)
            {
                if(nums[i]==0)
                {
                  res[i] = prod;
                }
                else
                {
                  res[i]=0;
                }
            }
            else
            {
               res[i] = prod/nums[i];
            }
        }
        return res;
    }
}  
