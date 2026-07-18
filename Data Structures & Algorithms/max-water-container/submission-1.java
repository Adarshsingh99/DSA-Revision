class Solution {
    public int maxArea(int[] heights) {
       // Brute Forec
       // har two pair of baar pe calculate kro;
       int ans = 0;
       int n = heights.length;
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
          int height = Math.min(heights[i],heights[j]);
          int length = (j-i);
          int water = height* length;
          ans = Math.max(ans,water);
        }
       } 
       return ans;
    }
}
