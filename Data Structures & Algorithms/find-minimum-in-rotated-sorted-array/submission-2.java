class Solution {
    public int findMin(int[] nums) {
   // divide array in two parts in which both array are sorted
   int n = nums.length;
    int start = 0;
    int end = n-1;
    int min = Integer.MAX_VALUE;
    while(start<=end)
    {
        int mid = (start+end)/2;
        min = Math.min(min,nums[mid]);

     // left side sorted
     if(nums[mid]>= nums[start])
     {
        min= Math.min(min,nums[start]);
        start = mid+1;
     }
     else if(nums[mid]<=nums[end])
     {
        min = Math.min(min,nums[mid]);
        end = mid-1;
     }
    } 
return min;
    }

}
