class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int have = 0;
        int needCount = need.size();

        int i = 0;

        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) &&
                window.get(ch).intValue() == need.get(ch).intValue()) {
                have++;
            }

            while (have == needCount) {

                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);

                window.put(left, window.get(left) - 1);

                if (need.containsKey(left) &&
                    window.get(left) < need.get(left)) {
                    have--;
                }

                if (window.get(left) == 0)
                    window.remove(left);

                i++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}