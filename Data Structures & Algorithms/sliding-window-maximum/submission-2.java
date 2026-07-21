

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int i=0,j=0;
        while(j<n) {

       map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
           while((j-i+1)==k)
           {
            ans[i] = map.lastKey();
            map.put(nums[i], map.getOrDefault(nums[i], 0) - 1);
            if(map.get(nums[i])==0) 
            {
                map.remove(nums[i]);
            }
            i++;
           }
           j++;
        }

        return ans;
    }
}