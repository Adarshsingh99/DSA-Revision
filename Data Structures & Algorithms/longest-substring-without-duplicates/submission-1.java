class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int ans =0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s.length())
        {
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch) > 1 && i< s.length())
            {
                 map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                 i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}