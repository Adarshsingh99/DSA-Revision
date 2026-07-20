class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }
       int i=0;
       int j=0;
       int n = s2.length();
       int k = s1.length();
       while(j<n)
       {
          // expand 
            
            freq2[s2.charAt(j) - 'a']++;
            // slide 
            while(j-i+1 > k)
            {
              
                freq2[s2.charAt(i) - 'a']--;
            //   if(map.get(ch2)==0)
            //   {
            //     map.remove(ch2);
            //   }
              i++;
            }
          // calculate
          if (Arrays.equals(freq1, freq2))
                return true;
                j++;
       }
       

        return false;
    }
}