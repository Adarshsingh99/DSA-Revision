class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int ans [] = new int [t.length];
        int n = t.length;
        st.push(n-1);
        ans[n-1] = 0;
        for(int i=n-2;i>=0;i--)
        {
             while(!st.empty() && t[i] >= t[st.peek()] )
             {
                st.pop();
             }
               if(st.empty())
               {
                ans[i] = 0;
               }
               else
               {
                 ans[i]=st.peek()-i;
               }
            st.push(i);
        }
        return ans;
    }
}
