class Solution {
    public int lengthOfLastWord(String s) {
       String trimmedStr = s.trim();

       System.out.println("trimmedStr= " + trimmedStr);

       if (trimmedStr.length() == 0) {
        return 0;
       }

       if (trimmedStr.length() == 1) {
        return 1;
       }

       int i = trimmedStr.length() - 1;
       
       while (i > 0 && trimmedStr.charAt(i) != ' ') {
        i--;
       }

       System.out.println("i= " + i);

       return s.substring(i + 1, trimmedStr.length()).length();
    }
}