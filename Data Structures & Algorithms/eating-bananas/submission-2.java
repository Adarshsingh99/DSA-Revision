class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for(int x : piles)
        {
            end = Math.max(end,x);
        }
     int ans = -1;
    while(start<=end)
    {
        int mid = (start+end)/2;
        if(solve(piles,mid,h))
        {
            ans = mid;
           end = mid-1;
        }
        else
        {
            start= mid+1;
        }
    }

    return ans;


    }
    public boolean solve(int[]arr, int k, int h)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
           count += (int) Math.ceil((double) arr[i] / k);
           if(count > h) return false;
        }
        return true;
    }
}
