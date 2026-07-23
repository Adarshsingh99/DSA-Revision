class Solution {
    public int findMin(int[] nums) {
        // nlog(n)
        Arrays.sort(nums);
        return nums[0];
    }
}
