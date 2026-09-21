class Solution {
    public int[] countBits(int n) {
       int[] result = new int[n + 1];

       for (int i = 0; i <= n;) {
        int count = 0;
        int value = i;
        while (value != 0) {
            value &= value - 1;
            count++;
        }
        result[i] = count;
        i++;
       }

       return result;
    }
}
