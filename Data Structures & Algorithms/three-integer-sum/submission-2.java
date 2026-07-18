class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
       Arrays.sort(nums);
       for(int i=0;i<n;i++)
       {
          if(i>0 && nums[i]==nums[i-1])
          {
            continue;
          }
          int m1 = nums[i];
         twoSum(nums,i+1,n-1,-m1);
       }
       return res;
    }
    public void twoSum(int[]nums, int i , int j , int target)
    {
        while(i<j)
        {
            if(nums[i]+nums[j]>target)
            {
                j--;
            }
            else if(nums[i]+nums[j] < target)
            {
                i++;
            }
            else
            {
                List<Integer> list = new ArrayList<>();
                list.add(-target);
                while(i<j && nums[i]==nums[i+1])i++;
                while(i<j && nums[j]==nums[j-1])j--;
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);
                i++;
                j--;
            }
        }
    }
}