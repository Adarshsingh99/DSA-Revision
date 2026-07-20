class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> map= new HashMap<>();

        for (char ch : s1.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
       int i=0;
       int j=0;
       int n = s2.length();
       int k = s1.length();
       while(j<n)
       {
          // expand 
            char ch1= s2.charAt(j);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
            // slide 
            while(j-i+1 > k)
            {
              char ch2= s2.charAt(i);
              map.put(ch2, map.getOrDefault(ch2, 0) - 1);
              if(map.get(ch2)==0)
              {
                map.remove(ch2);
              }
              i++;
            }
          // calculate
          if(need.equals(map)) return true;
          j++;
       }
       

        return false;
    }
}