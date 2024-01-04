class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            int len1 = expandAroundCenter(s, i, i); // for odd-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // for even-length palindromes
            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLength);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
