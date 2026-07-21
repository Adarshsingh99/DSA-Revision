class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int i = 0, j = 0;

        while (j < n) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) {
                dq.pollLast();
            }
            dq.offerLast(j);
            if (j - i + 1 == k) {
                ans[i] = nums[dq.peekFirst()];
                if (dq.peekFirst() == i) {
                    dq.pollFirst();
                }

                i++;
            }

            j++;
        }

        return ans;
    }
}