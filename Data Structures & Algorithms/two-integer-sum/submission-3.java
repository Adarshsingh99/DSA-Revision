class Solution {
    public int[] twoSum(int[] nums, int target) {
        // by sorting
        int n = nums.length;
        int arr[][] = new int [n][2];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=nums[i]; // store value
            arr[i][1]=i; // store index
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int i=0;
        int j= n-1;
        int ans[]= new int[2];
        while(i<j)
        {
            int curr = arr[i][0] + arr[j][0];
            if(curr==target)
            {
               ans[0]= arr[i][1];
               ans[1]= arr[j][1];
               break;
            }
            else if(curr > target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
