class Solution {
    public boolean isPalindrome(String s) {

        int n = s.length();
        int i=0;
        int j=n-1;
        while(i<j)
        {
        
                    // Skip non-alphanumeric from left
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            // Skip non-alphanumeric from right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }


            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
