class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();
        int n = s2.length();

        if (k > n) return false;

        int[] freq1 = new int[26];

        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (int i = 0; i <= n - k; i++) {

            int[] freq2 = new int[26];

            for (int j = i; j < i + k; j++) {
                freq2[s2.charAt(j) - 'a']++;
            }

            if (Arrays.equals(freq1, freq2))
                return true;
        }

        return false;
    }
}