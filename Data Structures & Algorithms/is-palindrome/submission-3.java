class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while (first < last) {
            while (first < last && !isCharacter(s.charAt(first))) {
                first++;
            }

            while (last > first && !isCharacter(s.charAt(last))) {
                last--;
            }

            if (Character.toUpperCase(s.charAt(first)) != Character.toUpperCase(s.charAt(last))) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }

    private boolean isCharacter(char ch) {
        return ((ch >= 'A' && ch <= 'Z') ||
        (ch >= 'a' && ch <= 'z') || 
        (ch >= '0' && ch <= '9'));
    }
}
