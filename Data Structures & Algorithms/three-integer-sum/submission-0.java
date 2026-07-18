class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // using three loops
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        HashSet< ArrayList<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k= j+1;k<n ;k++)
                {
                    int sum = nums[i]+nums[j]+nums[k];
                    if (sum == 0)
                    {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if(!set.contains(temp)){
                        res.add(new ArrayList<>(temp));
                         set.add(temp);
                        }
                    }
                }
            }
        }
        return res;
    }
}
