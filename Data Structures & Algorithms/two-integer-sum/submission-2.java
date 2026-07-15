class Solution {
    public int[] twoSum(int[] nums, int target) {
        // using HashMap

        // target = nums[i]+nums[j];
        // nums[i]=target-nums[j];
        // if we store nums[i] with anywhere our problem will be easy..
        // use HashMap to store nums[i];

        int n = nums.length;
            HashMap<Integer,Integer> map = new HashMap<>();
            int ans [] = new int[2];
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(target-nums[i]))
                {
                    ans[0]=i;
                    ans[1]=map.get(target-nums[i]);
                }
                map.put(nums[i],i);
            }
            Arrays.sort(ans);
            return ans;
    }
}
