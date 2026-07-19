class Solution {
    public int lengthOfLongestSubstring(String s) {    
        int ans = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            HashSet<Character>set = new HashSet<>();
            for(int j=i;j<n;j++)
            {
               if(set.contains(s.charAt(j)))
               {
                   break; 
               }
               else
               {
                set.add(s.charAt(j));  
                 ans = Math.max(ans,set.size());         
               }
            }
        }
        return ans;
    }
}
