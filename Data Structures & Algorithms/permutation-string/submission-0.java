class Solution {
    public boolean checkInclusion(String s1, String s2) {
          HashMap<Character,Integer>map = new HashMap<>();
          for(char ch : s1.toCharArray())
          {
            map.put(ch,map.getOrDefault(ch,0)+1);
          }
          int k = s1.length();
          int n = s2.length();
          for(int i=0;i<=(n-k);i++)
          {
             HashMap<Character,Integer>map1 = new HashMap<>();
            for(int j=i;j<i+k;j++)
            {
                char ch1 = s2.charAt(j);
               map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            }
            System.out.println(map1);
           if(map.equals(map1))
           return true;
          }
          return false;
    }
}


// //TC ; O((n-k+1) * k)
// ≈ O(n*k)