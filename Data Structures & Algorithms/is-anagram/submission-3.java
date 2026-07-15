class Solution {
    public boolean isAnagram(String s, String t) {
       int m = s.length();
       int n = t.length();
       if(m!=n) return false;

    //     use frequency array
       int count [] = new int [26];
       for(int i=0;i<n;i++)
       {
          count[s.charAt(i)-'a']++;
          count[t.charAt(i)-'a']--;
       }
       System.out.print(count);
       for(int x : count)
       {
        if(x!=0) return false;
       }
       return true;
    }
}
