class Solution {
    public String minWindow(String s, String t) {
        if(t.length()==0) return "";

        HashMap<Character,Integer>Tmap = new HashMap<>();
        HashMap<Character,Integer>Smap = new HashMap<>();

        for(char c : t.toCharArray())
        {
            Tmap.put(c,Tmap.getOrDefault(c,0)+1);
        }

        int need = Tmap.size();
        int res[] = new int[2];
        int minLength = Integer.MAX_VALUE;
        int i=0,j=0;
        int n = s.length();
        while(j<n)
        {
            char ch1 = s.charAt(j);
            Smap.put(ch1,Smap.getOrDefault(ch1,0)+1);

            if(Tmap.containsKey(ch1) && Smap.get(ch1)==Tmap.get(ch1))
            {
              need--;
            }

            while(need==0)
            {
                if((j-i+1) < minLength)
                {
                    minLength = j-i+1;
                    res[0] = i;
                    res[1] = j;
                }

            char ch2 = s.charAt(i);
            Smap.put(ch2,Smap.getOrDefault(ch2,0)-1);

            if(Tmap.containsKey(ch2) && Smap.get(ch2) < Tmap.get(ch2))
            {
              need++;
            }
            i++;

            }
            j++;
        }

               return minLength == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
      
    }
}
