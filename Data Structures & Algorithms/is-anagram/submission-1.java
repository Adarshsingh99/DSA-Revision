class Solution {
    public boolean isAnagram(String s, String t) {
       int m = s.length();
       int n = t.length();
       if(m!=n) return false;
     
     // sorting
     char[] S = s.toCharArray();
     char[] T = t.toCharArray();

     Arrays.sort(S);
     Arrays.sort(T);
     System.out.print(S);
     System.out.println();
     System.out.print(T);
     return Arrays.equals(S, T);

    }
}
