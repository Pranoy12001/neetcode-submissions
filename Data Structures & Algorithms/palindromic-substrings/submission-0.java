class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += palindromeCount(s, i, i);
            count += palindromeCount(s, i - 1, i);
        }

        return count;
    }


    private int palindromeCount (String s, int i, int j) {
        int count = 0;

        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }

        return count;
    }
}
