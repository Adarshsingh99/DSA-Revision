class Solution {
    public int maxArea(int[] heights) {
       int ans = 0;
       int i=0;
       int j= heights.length-1;
       while(i<j)
       {
          int height = Math.min(heights[i],heights[j]);
          int length = (j-i);
          int water = height* length;
          ans = Math.max(ans,water);
          if(heights[i] <= heights[j])
          {
            i++;
          }
          else
          {
             j--;
          }
       }
       return ans; 
    }
}
