class Solution {
    public boolean isPalindrome(String s) {
        int firstIndex = 0;
        int lastIndex = s.length() - 1;

        while (firstIndex < lastIndex) {
            while((firstIndex < lastIndex) && !alphaNum(s.charAt(firstIndex))) {
                firstIndex++;
            }

            while((lastIndex > firstIndex) && !alphaNum(s.charAt(lastIndex))) {
                lastIndex--;
            }

            if (Character.toUpperCase(s.charAt(firstIndex)) != Character.toUpperCase(s.charAt(lastIndex))) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }

        return true;
    }

    private boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
