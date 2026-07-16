class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // extreme brute force
        List<List<String>> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int n= strs.length;
        for(int i=0;i<n;i++)
        {
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);

                String currS1 = strs[i];
                char[]ch1 = currS1.toCharArray();
                Arrays.sort(ch1);
                String sortedS1 = new String(ch1);

            if(set.contains(currS1)) continue;

            for(int j=i+1;j<n;j++)
            {


                String currS2 = strs[j];
                char[]ch2= currS2.toCharArray();
                Arrays.sort(ch2);
                String sortedS2 = new String(ch2);
                if(sortedS1.equals(sortedS2))
                {

                      temp.add(currS2);
                      set.add(currS2);
                }
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}
