class Solution {
    public static int[] findLse(int arr[], int n)
    {
         Stack<Integer> st = new Stack<>();
         int lse[]= new int[n];
         for(int i=0;i<n;i++)
         {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
               st.pop();
            }
            if(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                lse[i]=st.peek();
            }
            else
            {
                lse[i] = -1;
            }
            st.push(i);
         }
         return lse;
    }
    public static int[] findrse(int arr[], int n)
    {
        Stack<Integer> st = new Stack<>();
         int rse[]= new int[n];
         for(int i=n-1;i>=0;i--)
         {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            {
               st.pop();
            }
            if(!st.isEmpty() && arr[st.peek()]<arr[i])
            {
                rse[i]=st.peek();
            }
            else
            {
                rse[i] = n;
            }
             st.push(i);
         }
         return rse;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int lse[] =findLse(heights,n);
        int rse[] = findrse(heights,n);
        int maxarea=0;
        for(int i=0;i<n;i++)
        {
            int width=rse[i]-lse[i]-1;
            int area= heights[i]*width;
             maxarea = Math.max(area,maxarea);
        } 
        return maxarea;
    }
}