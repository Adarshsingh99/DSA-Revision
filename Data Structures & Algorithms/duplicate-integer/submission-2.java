class Solution {
    public boolean hasDuplicate(int[] nums) {
        // 2nd Approach use hashmap or hashset
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            set.add(x);
        }
        return set.size()!=nums.length;
    }
}