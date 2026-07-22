class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int ans[] = new int [n];
        for(int i=0;i<n;i++)
        {
            int temp =0;
          for(int j=i+1;j<n;j++)
          {
            if(i==n-1)
            {
                ans[i]=0;
                break;
            }
            if(t[i]<t[j])
            {
                ans[i] = j-i;
                break;
            } 
            else
            {
                ans[i] = 0;
            }
          }
        }
        return ans;
    }
}
