class Solution {
    public boolean hasDuplicate(int[] nums) {
        // brute : use two loop
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
}