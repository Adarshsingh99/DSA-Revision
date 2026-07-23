class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
      int start =0;
      int end =  n-1;
      int ans = -1;
      while(start <= end)
      {
        int mid = (start+end)/2;
        if (nums[mid]==target)
        {
           ans = mid;
           break;
        }
        if(nums[mid] >= nums[start]) // left sorted
        {
              if(target > nums[mid] || target < nums[start])
              {
                 start = mid+1;
              }
              else
              {
                 end = mid-1;
              }
        }
        else  // right sorted
        {
            if(target < nums[mid] || target > nums[end])
            {
                end= mid-1;
            }else
            {
                 start = mid+1;
            }
        }
      }
      return ans;
    }
}
