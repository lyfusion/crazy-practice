package online.elysium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        // babad
        // cbbd
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int size = chars.length - i;
            for (int j = 0; j < i + 1; j++) {
                if (isPalindrome(s.substring(j, j + size))) {
                    return s.substring(j, j + size);
                }
            }
        }
        
        return "";
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
