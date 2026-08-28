class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int num : nums) {
            if (num != 1) {
                result = Math.max(result, count);
                count = 0;
            } else {
                count++;
            }
        }

        return Math.max(result, count);
    }
}