class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        // traverse set
        int ans = 0;
        for(int num : set)
        {
            // agar num se 1 kam value (num-1) aur pichhe ja k start kro
            if(set.contains(num-1)) continue;

            if(!set.contains(num-1))
            {
               // start counting from here
               int count =0;
               while(set.contains(num+count))
               {
                count++;
               }
               ans = Math.max(count,ans);
            }
        }
        return ans;
    }
}
