// class Solution {
//     public int characterReplacement(String s, int k) {
//         int ans =0;
//         int n = s.length();
        
//         for(int i=0;i<n;i++)
//         {
//             HashMap<Character,Integer> map = new HashMap<>();
//             int maxFeq=0;
//             for(int j=i;j<n;j++)
//             {
//                 char ch = s.charAt(j);
//                 map.put(ch,map.getOrDefault(ch,0)+1);
//                 maxFeq = Math.max(maxFeq,map.get(ch));
//                 if((j-i+1)-maxFeq <= k)
//                 {
//                    ans = Math.max(ans,j-i+1);
//                 }
                
//             }
//         }
//         return ans;
//     }
// }

// here i am going to optimize same code


class Solution {
    public int characterReplacement(String s, int k) {
            int ans =0;
            int n = s.length();
            HashMap<Character,Integer> map = new HashMap<>();
            int maxFeq=0;
            int i=0;
            for(int j=0;j<n;j++)
            {
                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                maxFeq = Math.max(maxFeq,map.get(ch));
                while( (j-i+1)-maxFeq > k)
                {
                    char ch1 = s.charAt(i);
                   map.put(ch1,map.getOrDefault(ch1,0)-1);
                   i++;
                }
                ans = Math.max(ans,j-i+1);
            }
        
        return ans;
    }
}
